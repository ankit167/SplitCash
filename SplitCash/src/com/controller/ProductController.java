package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.ValidationDaoImpl;
import com.entity.Product;
import com.entity.User;

@Controller
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	private ValidationDaoImpl validdao;	

	public ValidationDaoImpl getValiddao() {
		return validdao;
	}

	public void setValiddao(ValidationDaoImpl validdao) {
		this.validdao = validdao;
	}
	
	
	@RequestMapping(value="productdetails.htm",method=RequestMethod.GET)
	public String productDetails(HttpServletRequest request, Model model)
	{
		List<Product> products = validdao.proDetails();
		model.addAttribute("products", products);
		System.out.println("Abishek");
		return "Products";
	}

}
