
package com.baizhi.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.baizhi.entity.Card;
import com.baizhi.entity.User;

public class TestUser {

	public static void main(String[] args) throws Exception, NoSuchFieldException {
		
		/*Field[] declaredFields = User.class.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
			System.out.println(field.getType());
		}*/
		//Field declaredField = User.class.getDeclaredField("address");
		//System.out.println(declaredField.getType());
		
		List<String> aslist = new  ArrayList<String>();
		Field[] declaredFields = User.class.getDeclaredFields();
		for (Field field : declaredFields) {
			aslist.add(field.getName());
		}
		
		boolean contains = aslist.contains("name");
		System.out.println(contains);
		
	}

}
