package com.yuy.architecture1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuy.architecture1.cartmgr.service.ICartService;
import com.yuy.architecture1.cartmgr.vo.CartModel;
import com.yuy.architecture1.cartmgr.vo.CartQueryModel;
import com.yuy.architecture1.goodsmgr.service.IGoodsService;
import com.yuy.architecture1.goodsmgr.vo.GoodsModel;
import com.yuy.architecture1.goodsmgr.vo.GoodsQueryModel;
import com.yuy.architecture1.ordermgr.service.IOrderService;
import com.yuy.pageutil.Page;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private IGoodsService igs;
	@Autowired
	private ICartService ics;
	@Autowired
	private IOrderService ios;
	@RequestMapping(value="/toIndex",method=RequestMethod.GET)
	public String toIndex(Model model){
		GoodsQueryModel gqm = new GoodsQueryModel();
		gqm.getPage().setPageShow(100);
		
		
		Page<GoodsModel> page =  igs.getByConditionPage(gqm);
		
		model.addAttribute("page", page);
		return "index";
	}
	
	@RequestMapping(value="/toGoodsDesc/{goodsUuid}",method=RequestMethod.GET)
	public String toGoodsDesc(Model model,@PathVariable("goodsUuid") int goodsUuid){
		GoodsModel gm = igs.getByUuid(goodsUuid);
		
		model.addAttribute("m", gm);
		return "goods/desc";
	}
	
	@RequestMapping(value="/addToCart/{goodsUuid}",method=RequestMethod.GET)
	public String addToCart(Model model,@PathVariable("goodsUuid") int goodsUuid,@CookieValue("MyLogin")String myLogin){
		int customerUuid = Integer.parseInt(myLogin.split(",")[0]);
		
		CartModel cm = new CartModel();
		cm.setBuyNum(1);
		cm.setCustomerUuid(customerUuid);
		cm.setGoodsUuid(goodsUuid);
		ics.create(cm);
		/////////////////
		CartQueryModel cqm = new CartQueryModel();
		cqm.getPage().setPageShow(1000);
		cqm.setCustomerUuid(customerUuid);
		
		Page<CartModel> page = ics.getByConditionPage(cqm);
		System.out.println(page);
		model.addAttribute("page", page);
		
		return "cart/myCart";
	}
	@RequestMapping(value="/toCart",method=RequestMethod.GET)
	public String toCart(Model model,@CookieValue("MyLogin")String myLogin){
		int customerUuid = Integer.parseInt( myLogin.split(",")[0]);
		
		CartQueryModel cqm = new CartQueryModel();
		cqm.getPage().setPageShow(1000);
		cqm.setCustomerUuid(customerUuid);
		
		Page<CartModel>  page = ics.getByConditionPage(cqm);
		
		model.addAttribute("page",page);
		
		return "cart/myCart";
	}
	/*@RequestMapping(value="/order",method=RequestMethod.GET)
	public String order(){//@CookieValue("MyLogin")String myLogin){
		//1:查出这个人购物车所有的信息		
		int customerUuid = 1;//Integer.parseInt( myLogin.split(",")[0]);
		
		ios.order(customerUuid);
		
		return "success";
	}*/
}
