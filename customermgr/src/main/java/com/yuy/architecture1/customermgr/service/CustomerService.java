package com.yuy.architecture1.customermgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuy.architecture1.common.service.BaseService;
import com.yuy.architecture1.customermgr.dao.CustomerDAO;
import com.yuy.architecture1.customermgr.vo.CustomerModel;
import com.yuy.architecture1.customermgr.vo.CustomerQueryModel;




@Service
@Transactional
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
	private CustomerDAO dao = null;
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public CustomerModel getByCustomerId(String customerId) {
		return dao.getByCustomerId(customerId);
	}
	
}
