package com.baizhi.service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Card;
import com.baizhi.entity.User;
import com.baizhi.util.MybatisUtil;

public class UserServiceImpl implements UserService {

	
	public List<User> findAll() {
		UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
		List<User> users = userDAO.queryAll();
		MybatisUtil.close();
		return users;
	}

	public void add(User user) {
		try {
			UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
			user.setId(UUID.randomUUID().toString());//处理业务1:设置主键
			userDAO.add(user);
			MybatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
			MybatisUtil.rollback();
		}
	}

	public List<User> findAllNoCard() {
		UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
		List<User> list = userDAO.queryAllNoCard();
		MybatisUtil.close();
		return list;
	}

	//cols name   age         keywords  张三  ,23
	public List<User> findByKeywords(List<String> cols, String keywords) {
		try {
			UserDAO userDAO = MybatisUtil.getSqlSession().getMapper(UserDAO.class);
			//0.keyword 拆分
			String[] split = keywords.split(",");
			//1.遍历所有接收到的列
			User user = new User();
			for (int i = 0; i < cols.size(); i++) {
				//获取每次遍历的属性名
				String field = cols.get(i);
				//将用户的属性名放入list集合中
				List<String> aslist = new  ArrayList<String>();
				Field[] declaredFields = User.class.getDeclaredFields();
				for (Field f : declaredFields) {
					aslist.add(f.getName());
				}
				//判断当前遍历的属性名是否属于user对象中的属性
				boolean contains = aslist.contains(field);
				//拼接set方法
				String setMethodName = "set"+field.substring(0, 1).toUpperCase()+field.substring(1);
				if(contains){//user对象中的属性
					//动态获取列的类型
					Class<?> type = User.class.getDeclaredField(field).getType();
					//通过反射获取类中set方法
					Method setMethod = User.class.getDeclaredMethod(setMethodName, new Class[]{type});
					//执行set方法
					if(type==Integer.class){
						setMethod.invoke(user, Integer.valueOf(split[i]));//执行方法 参数1:执行那个对象中set方法
					}
					if(type==String.class){
						setMethod.invoke(user, split[i]);//执行方法 参数1:执行那个对象中set方法
					}
					if(type==Date.class){
						setMethod.invoke(user, new SimpleDateFormat("yyyy-MM-dd").parse(split[i]));//执行方法 参数1:执行那个对象中set方法
					}
				}else{//否则这个属性一定在Card对象中
					Class<?> type = Card.class.getDeclaredField(field).getType();
					//返回类中方法对象
					Method setMethod = Card.class.getDeclaredMethod(setMethodName, new Class[]{type});
					//执行set方法
					if(type==Integer.class){
						setMethod.invoke(user.getCard(), Integer.valueOf(split[i]));
					}
					if(type==String.class){
						setMethod.invoke(user.getCard(), split[i]);
					}
				}
			}
			System.out.println("打印:  "+user);
			List<User> users = userDAO.queryByKeywords(user);
			MybatisUtil.close();
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			MybatisUtil.close();
		}
		return  null;
	}

}
