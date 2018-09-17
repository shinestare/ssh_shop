package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * �û�ģ��Action����
 * @author wang
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	// ģ������Ҫʹ�õĶ���
	private User user = new User();
	
	public User getModel() {
		return user;
	}
	
	// ע��UserService
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	/**
	 * ��ת��ע��ҳ���ִ�з���
	 */
	public String registerPage(){
		return "registerPage";
	}
	
	/**
	 * AJAX�����첽У���û�����ִ�з���
	 * @throws IOException 
	 */
	public String findByName() throws IOException{
		// ����service���в�ѯ
		User existUser = userService.findByUsername(user.getUsername());
		// ���response������ҳ�����
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		// �ж�
		if (existUser != null) {
			// ��ѯ�����û����û����Ѵ���
			response.getWriter().println("<font color='red'>�û����Ѿ�����</font>");
		} else {
			// û��ѯ�����û����û���������
			response.getWriter().println("<font color='green'>�û�������ʹ��</font>");
		}
		return NONE;
	}

	
}
