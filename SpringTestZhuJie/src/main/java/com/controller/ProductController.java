package com.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.jdbc;
import com.Dao.jdbcImplement;
import com.domain.Product;
import com.form.ProductForm;

@Controller
public class ProductController {
	private final static Log logger = LogFactory.getLog(ProductController.class);
	
	@Autowired
	private jdbcImplement jdbc;

	@RequestMapping("/product_input")
	public String inputProduct() {
		logger.info("inputProduct called");

		return "ProductForm";
	}

	@RequestMapping("/product_save")
	public String saveProduct(ProductForm productForm, Model model) {
		logger.info("SavaProduct called");

		Product product = new Product();
		product.setName(productForm.getName());
		product.setDescription(productForm.getDescription());
		product.setPrice(Float.parseFloat(productForm.getPrice()));
		model.addAttribute("product", product);
		return "ProductDetails";
	}

}
