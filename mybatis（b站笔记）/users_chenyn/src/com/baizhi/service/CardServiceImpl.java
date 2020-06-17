package com.baizhi.service;

import java.util.UUID;

import com.baizhi.dao.CardDAO;
import com.baizhi.entity.Card;
import com.baizhi.util.MybatisUtil;

public class CardServiceImpl  implements CardService{

	public void add(Card card) {
		try {
			CardDAO cardDAO = MybatisUtil.getSqlSession().getMapper(CardDAO.class);
			//处理业务1.主键生成
			card.setId(UUID.randomUUID().toString());
			cardDAO.add(card);
			MybatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
			MybatisUtil.rollback();
		}
		
	}

	
	
}
