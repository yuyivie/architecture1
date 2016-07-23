package com.yuy.architecture1.goodsmgr.vo;

import com.yuy.architecture1.common.vo.BaseModel;

public class GoodsModel extends BaseModel{
	private String name;
	private String imgPath;
	private String description;
	
	public void setName(String obj){
		this.name = obj;
	}
	public String getName(){
		return this.name;
	}
	
	public void setImgPath(String obj){
		this.imgPath = obj;
	}
	public String getImgPath(){
		return this.imgPath;
	}
	
	public void setDescription(String obj){
		this.description = obj;
	}
	public String getDescription(){
		return this.description;
	}
	
	
	
	public String toString(){
		return "Model"+this.getClass().getName()+"[name=" + this.getName() + ",imgPath=" + this.getImgPath() + ",description=" + this.getDescription() + ",]";
	}	
}
