package com.yuy.architecture1.ordermgr.dao;

import org.springframework.stereotype.Repository;
import com.yuy.architecture1.common.dao.BaseDAO;

import com.yuy.architecture1.ordermgr.vo.OrderModel;
import com.yuy.architecture1.ordermgr.vo.OrderQueryModel;

@Repository
public interface OrderDAO extends BaseDAO<OrderModel,OrderQueryModel>{
	
}
