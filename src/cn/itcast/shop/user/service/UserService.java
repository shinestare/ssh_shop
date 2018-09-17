package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;

/**
 * �û�ģ��ҵ������
 * @author wang
 *
 */
@Transactional
public class UserService {
	// ע��UserDao
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	// �����û�����ѯ�û��ķ���
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}
}
