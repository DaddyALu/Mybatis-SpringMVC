package com.baizhi.test;

import java.util.List;

import com.baizhi.dao.CardDAO;
import com.baizhi.entity.Card;
import com.baizhi.util.MybatisUtil;

public class TestCardDAO {
	public static void main(String[] args) {
		
		List<Card> list = MybatisUtil.getSqlSession().getMapper(CardDAO.class).queryAll();
		for (Card card : list) {
			System.out.print(card+"         ");
			System.out.println(card.getUser());
			System.out.println("================================");
		}
		MybatisUtil.close();
	}

}
