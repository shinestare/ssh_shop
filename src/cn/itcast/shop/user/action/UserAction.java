package cn.itcast.shop.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户模块Action的类
 * @author wang
 *
 */
public class UserAction extends ActionSupport {

	/**
	 * 跳转到注册页面的执行方法
	 */
	public String registerPage(){
		return "registerPage";
	}
	
	/**
	 * AJAX进行异步校验用户名的执行方法
	 */
	public String findByName(){
		
	}
}
