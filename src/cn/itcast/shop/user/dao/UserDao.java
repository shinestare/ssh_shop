package cn.itcast.shop.user.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

/**
 * �û�ģ��־ò����
 * @author wang
 *
 */
public class UserDao extends HibernateDaoSupport{

	// �������Ʋ�ѯ�Ƿ��и��û�
	public User findByUsername(String username){
		String hql = "from User where username = ?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, username);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
}
