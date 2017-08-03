package com.controller;

import com.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by wxq on 17-8-3.
 */
@Controller
public class productController {

    @RequestMapping(value="/product_input")
    public String inputProduct (Model model){
        model.addAttribute("product",new Product());
        return "ProductForm";
    }

    @RequestMapping(value="/product_save")
    public String saveProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return "ProductForm";
        }
        model.addAttribute("product",product);
        return "ProductDetails";
    }
}
