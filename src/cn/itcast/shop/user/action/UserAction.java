package cn.itcast.shop.user.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * �û�ģ��Action����
 * @author wang
 *
 */
public class UserAction extends ActionSupport {

	/**
	 * ��ת��ע��ҳ���ִ�з���
	 */
	public String registerPage(){
		return "registerPage";
	}
	
	/**
	 * AJAX�����첽У���û�����ִ�з���
	 */
	public String findByName(){
		
	}
}
