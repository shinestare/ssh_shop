package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;

/**
 * 用户模块业务层代码
 * @author wang
 *
 */
@Transactional
public class UserService {
	// 注入UserDao
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	
	// 按照用户名查询用户的方法
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}
}
