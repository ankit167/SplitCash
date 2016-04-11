package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.entity.Product;
import com.entity.User;

public class ValidationDaoImpl implements ValidationDaoI{

	
	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate1) {
		this.hibernateTemplate = hibernateTemplate1;
	}


	@Override
	public User validateUser(String name, String pass) {
		
		String hql="from User where phone=? and password=?";
		Object[] params={name,pass};
		List<User> lst=hibernateTemplate.find(hql,params);
		if(lst.size()!=0)
			return lst.get(0);
		return null;
	}
	
	@Override
    public List<Product> proDetails()
    {
        String hql="from Product";
        List<Product> products=hibernateTemplate.find(hql);
        return products;    
    }
	
}
