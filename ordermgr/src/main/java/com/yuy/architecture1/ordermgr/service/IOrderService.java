package com.yuy.architecture1.ordermgr.service;


import com.yuy.architecture1.common.service.IBaseService;

import com.yuy.architecture1.ordermgr.vo.OrderModel;
import com.yuy.architecture1.ordermgr.vo.OrderQueryModel;

public interface IOrderService extends IBaseService<OrderModel,OrderQueryModel>{
	public void order(int customerUuid);
}

