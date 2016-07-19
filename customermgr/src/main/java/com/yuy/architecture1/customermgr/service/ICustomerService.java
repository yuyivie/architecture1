package com.yuy.architecture1.customermgr.service;

import com.yuy.architecture1.common.service.IBaseService;
import com.yuy.architecture1.customermgr.vo.CustomerModel;
import com.yuy.architecture1.customermgr.vo.CustomerQueryModel;



public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
