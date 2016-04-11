package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.entity.Split;
import com.entity.Transaction;
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
	public int setSplit(int id,int transaction_id,String[] phone,String[] amt) {
		
		 int[] user_id=new int[phone.length];int i;
         for(i=0;i<phone.length;i++){
         	  String hql = "select id from User where phone=?";
         	  Object[] params = { phone[i] };
         	  List<Integer> user = hibernateTemplate.find(hql, params);
         	  if(user.size()!=0)
         		  user_id[i]=user.get(0);
         	  else
         		  return -1;
         }
 		
         int[] amount=new int[amt.length];
         for(i=0;i<amount.length;i++)
         	amount[i]=Integer.parseInt(amt[i]);
         
         for(i=0;i<user_id.length;i++){
        	 Split s=new Split();
        	 s.setId(id);
        	 s.setTransaction_id(transaction_id);
        	 s.setUser_id(user_id[i]);
        	 s.setTopay(amount[i]);
        	 hibernateTemplate.save(s);
         }
         return 0;
         
	}
	
	@Override
	public int setBaseTransaction(int id,int initiator_id,int product_id,boolean status) {
		
		Transaction t=new Transaction();
		t.setUser_id(initiator_id);
		t.setProduct_id(product_id);
		t.setStatus(status);
		t.setId(id);
		hibernateTemplate.save(t);
		return t.getId();
	}
	
	@Override
	public int maxKey(String table_name, String id) {
		// TODO Auto-generated method stub
		String hql = "select max ("+id+") from "+table_name+"";
		System.out.println(hql);
		List<Integer> lst = hibernateTemplate.find(hql);
		System.out.println(lst);
		System.out.println(lst.get(0));
		if(lst == null||lst.get(0)==null) return 0;
		return lst.get(0);
	}

	
}
