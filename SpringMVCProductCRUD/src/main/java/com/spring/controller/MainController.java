package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.dao.ProductDao;
import com.spring.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/main")
	public String home(Model m) {
		
		List<Product> products = productDao.getAllProducts();
		m.addAttribute("products", products);
		
		return "main";
	}
	
	//show add product form
	@RequestMapping("/addproduct")
	public String addProduct(Model m) {
		
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	//handle add product form
	@RequestMapping(value="/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		
		productDao.createProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/main");
		return redirectView;
	}
	
	
	//handle delete product
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		
		productDao.deleteProduct(productId);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/main");
		return redirectView;
	}
	
	
	//handle update product
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model m) {
		
		Product product = productDao.getProduct(productId);
		m.addAttribute("product", product);
		return "update_product_form";
	}

}
