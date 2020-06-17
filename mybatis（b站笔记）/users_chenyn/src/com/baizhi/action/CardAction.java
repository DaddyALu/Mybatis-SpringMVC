package com.baizhi.action;

import com.baizhi.entity.Card;
import com.baizhi.service.CardService;
import com.baizhi.service.CardServiceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CardAction extends ActionSupport{
	
	private CardService cardService = new CardServiceImpl();
	private Card card;
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}



	//保存card信息
	public String add(){
		cardService.add(card);
		return Action.SUCCESS;
	}
	


}
