package com.yuy.architecture1.ordermgr.dao;

import org.springframework.stereotype.Repository;
import com.yuy.architecture1.common.dao.BaseDAO;

import com.yuy.architecture1.ordermgr.vo.OrderDetailModel;
import com.yuy.architecture1.ordermgr.vo.OrderDetailQueryModel;

@Repository
public interface OrderDetailDAO extends BaseDAO<OrderDetailModel,OrderDetailQueryModel>{
	
}
