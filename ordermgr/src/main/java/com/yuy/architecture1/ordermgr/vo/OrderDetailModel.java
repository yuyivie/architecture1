package com.yuy.architecture1.ordermgr.vo;

import com.yuy.architecture1.common.vo.BaseModel;

public class OrderDetailModel extends BaseModel{
	private Integer orderUuid;
	private Integer goodsUuid;
	private Integer orderNum;
	private Float price;
	private Float money;
	private Float saveMoney;
	
	public void setOrderUuid(Integer obj){
		this.orderUuid = obj;
	}
	public Integer getOrderUuid(){
		return this.orderUuid;
	}
	
	public void setGoodsUuid(Integer obj){
		this.goodsUuid = obj;
	}
	public Integer getGoodsUuid(){
		return this.goodsUuid;
	}
	
	public void setOrderNum(Integer obj){
		this.orderNum = obj;
	}
	public Integer getOrderNum(){
		return this.orderNum;
	}
	
	public void setPrice(Float obj){
		this.price = obj;
	}
	public Float getPrice(){
		return this.price;
	}
	
	public void setMoney(Float obj){
		this.money = obj;
	}
	public Float getMoney(){
		return this.money;
	}
	
	public void setSaveMoney(Float obj){
		this.saveMoney = obj;
	}
	public Float getSaveMoney(){
		return this.saveMoney;
	}
	
	
	
	public String toString(){
		return "Model"+this.getClass().getName()+"[orderUuid=" + this.getOrderUuid() + ",goodsUuid=" + this.getGoodsUuid() + ",orderNum=" + this.getOrderNum() + ",price=" + this.getPrice() + ",money=" + this.getMoney() + ",saveMoney=" + this.getSaveMoney() + ",]";
	}	
}
