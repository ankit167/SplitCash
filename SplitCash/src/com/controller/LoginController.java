package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.*;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ValidationDaoImpl;
import com.dao.ValidationDaoI;
import com.entity.User;

@Controller
public class LoginController {

	@Autowired
	private ValidationDaoImpl validdao;	

	public ValidationDaoImpl getValiddao() {
		return validdao;
	}

	public void setValiddao(ValidationDaoImpl validdao) {
		this.validdao = validdao;
	}


	@RequestMapping(value="user.htm",method=RequestMethod.GET)
	public String index1(HttpServletRequest request,Model model){
		System.out.println(request.getSession().getAttribute("flag"));
		if(request.getSession(false).getAttribute("flag")==null)
			return "redirect:login.htm";
		return "Products";
	}
	
	
	@RequestMapping(value="indexhome.htm",method=RequestMethod.GET)
	public String index3(Model model){		
		return "redirect: reg.htm";
	}
	
	
	
	@RequestMapping(value="login.htm",method=RequestMethod.POST)
	public String setSession(HttpServletRequest request, HttpServletResponse response, Model model){
		
		String name=request.getParameter("uname");
		String password=request.getParameter("pwd");
	
		
			User user=validate(name,password);
			if(user!=null){
				HttpSession sess=request.getSession();
				sess.setAttribute("user_id",user.getId());
				sess.setAttribute("phone",user.getPhone());
				sess.setAttribute("name",user.getName());
				sess.setAttribute("flag", 0);
				return "redirect:/Product/productdetails.htm";
			}
			model.addAttribute("invaliduserlogin","The username and password do not match");
			return "Login";
		
	}
	

	public User validate(String name,String password){
		User user=validdao.validateUser(name, password);
		return user;
	}
	
	@RequestMapping(value="logout.htm",method=RequestMethod.GET)
	public String destroySession(HttpServletRequest request,Model model){
		
		int flag=0;
		
		HttpSession sess=request.getSession(false);
		
		
		if(sess!=null){
			flag=(int) sess.getAttribute("flag");
			sess.invalidate();
		}

		return "redirect: reg.htm";
			
	}
}
