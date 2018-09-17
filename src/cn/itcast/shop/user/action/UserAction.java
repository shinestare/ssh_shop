package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户模块Action的类
 * @author wang
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	// 模型驱动要使用的对象
	private User user = new User();
	
	public User getModel() {
		return user;
	}
	
	// 注入UserService
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	/**
	 * 跳转到注册页面的执行方法
	 */
	public String registerPage(){
		return "registerPage";
	}
	
	/**
	 * AJAX进行异步校验用户名的执行方法
	 * @throws IOException 
	 */
	public String findByName() throws IOException{
		// 调用service进行查询
		User existUser = userService.findByUsername(user.getUsername());
		// 获得response对象，向页面输出
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		// 判断
		if (existUser != null) {
			// 查询到该用户：用户名已存在
			response.getWriter().println("<font color='red'>用户名已经存在</font>");
		} else {
			// 没查询到该用户：用户名可以用
			response.getWriter().println("<font color='green'>用户名可以使用</font>");
		}
		return NONE;
	}

	
}
