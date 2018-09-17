package cn.itcast.shop.user.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

/**
 * 用户模块持久层代码
 * @author wang
 *
 */
public class UserDao extends HibernateDaoSupport{

	// 按照名称查询是否有该用户
	public User findByUsername(String username){
		String hql = "from User where username = ?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
