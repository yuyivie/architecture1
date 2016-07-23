package com.yuy.architecture1.customermgr.vo;

import com.yuy.architecture1.common.vo.BaseModel;
import com.yuy.pageutil.Page;

public class CustomerModel extends BaseModel{
	
	private String customerId;
	private String pwd;
	private String registerTime;
	private String showName;
	private String trueName;
	

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [uuid=" + getUuid() + ", customerId=" + customerId
				+ ", pwd=" + pwd + ", registerTime=" + registerTime
				+ ", showName=" + showName + ", trueName=" + trueName + "]";
	}
	
	
}
