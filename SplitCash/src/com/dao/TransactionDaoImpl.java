package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.entity.User;

public class TransactionDaoImpl implements TransactionDaoI{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate1) {
		this.hibernateTemplate = hibernateTemplate1;
	}


	@Override
	public void setSplit() {
		
		/*String hql="from User where name=? and password=?";
		Object[] params={name,pass};
		List<User> lst=hibernateTemplate.find(hql,params);
		if(lst.size()!=0)
			return lst.get(0);
		return null;*/
	}
	
}
