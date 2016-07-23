package com.yuy.architecture1.ordermgr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuy.architecture1.common.service.BaseService;

import com.yuy.architecture1.ordermgr.dao.OrderDAO;
import com.yuy.architecture1.ordermgr.vo.OrderModel;
import com.yuy.architecture1.ordermgr.vo.OrderQueryModel;

@Service
@Transactional
public class OrderService extends BaseService<OrderModel,OrderQueryModel> implements IOrderService{
	private OrderDAO dao = null;
	@Autowired
	private void setDao(OrderDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}