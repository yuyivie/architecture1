package com.yuy.architecture1.customermgr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuy.architecture1.customermgr.dao.CustomerDAO;
import com.yuy.architecture1.customermgr.service.CustomerService;
import com.yuy.architecture1.customermgr.service.ICustomerService;
import com.yuy.architecture1.customermgr.vo.CustomerModel;
import com.yuy.architecture1.customermgr.vo.CustomerQueryModel;
import com.yuy.pageutil.Page;

@Service
@Transactional
public class Client {
	@Autowired
	private  ICustomerService s = null;
	
	/**
	 * 当类上加了 @Transactional 时    类会被spring 中的代理类处理 则s的类注入不进来
	 * @Autowired 只会把s的值注入到Client类中  而不会注入到改类的代理类，
	 * 所以需要加上改方法
	 *  
	 *  
	 *  注意：代理拦截方法 不会拦截属性 ？
	 *
	 * @return
	 */
	public ICustomerService getS(){
		return s;
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Client t  = (Client) ctx.getBean("client");
		
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("cl");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");
		t.getS().create(cm);
		CustomerQueryModel cqm =  new CustomerQueryModel();
		cqm.getPage().setNowPage(2);
//		Page<CustomerModel> page = t.s.getByConditionPage(cqm);
		Page<CustomerModel> page = t.getS().getByConditionPage(cqm);
		System.out.println("page==" + page);
//		System.out.println("list===" + list);
	}
}
