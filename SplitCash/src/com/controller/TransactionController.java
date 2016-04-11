package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.TransactionDaoImpl;
import com.dao.TransactionDaoI;
import com.entity.User;

@Controller
public class TransactionController {

	@Autowired
	private TransactionDaoImpl transdao;	

	public TransactionDaoImpl getTransdao() {
		return transdao;
	}

	public void setTransdao(TransactionDaoImpl transdao) {
		this.transdao = transdao;
	}
	
	@RequestMapping(value="split.htm",method=RequestMethod.GET)
	public void setSplitParameters(HttpServletRequest request,Model model){
		int initiator=(int) request.getSession().getAttribute("user_id");
		int product_id=Integer.parseInt(request.getParameter("product"));
	}
/*
	@RequestMapping(value="user.htm",method=RequestMethod.GET)
	public String index1(HttpServletRequest request,Model model){
		System.out.println(request.getSession().getAttribute("flag"));
		if(request.getSession(false).getAttribute("flag")==null)
			return "redirect:login.htm";
		return "Products";
	}
	*/
	
	
}
