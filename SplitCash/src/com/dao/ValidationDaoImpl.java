package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.entity.Product;
import com.entity.Split;
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
	
	@Override
	public Split notification(int user_id){
		 String hql = "select transaction_id,topay from Split where user_id=? and consent=?";
    	  Object[] params = { user_id,null };
    	  List<Split> s = hibernateTemplate.find(hql, params);
    	  return s.get(0);
	}
	
	@Override
	public String getInitiator(int transaction_id){
		String hql="select user_id from Transaction where id=?";
		Object[] params1 = { transaction_id };
		List<Integer> uid=hibernateTemplate.find(hql,params1);
		hql="select status from TransactionStatus where id=?";
		Object[] params2 = { transaction_id };
		List<Boolean> status=hibernateTemplate.find(hql,params2);
		if(status.get(0).equals("ok")==false){
			hql="select name from User where id=?";
			Object[] params3 = { uid.get(0) };
			List<String> uname=hibernateTemplate.find(hql,params3);
			return uname.get(0);
		}
		return "";
	}
	
	/*@Override
	public String getProductName(int transaction_id){
		String hql="select product_id from Transaction where id=?";
		Object[] params1 = { transaction_id };
		List<Integer> pid=hibernateTemplate.find(hql,params1);
		hql="select name from User where id=?";
		Object[] params3 = { pid.get(0) };
		List<String> pname=hibernateTemplate.find(hql,params3);
		return pname.get(0);
	
	}*/
	
	@Override
    public Product getProductDetails(int id) {
        // TODO Auto-generated method stub
        String hql = "from Product where id=?";
        Object params = id;
        List<Product> product = hibernateTemplate.find(hql, params);
        if(product.size() != 0)
            return product.get(0);
        return null;
    }
}
