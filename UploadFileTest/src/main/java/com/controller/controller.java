package com.controller;

import com.domain.Product;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxq on 17-8-14.
 */
@Controller
public class controller {
    @RequestMapping(value="/product_input")
    public String inputProduct(Model model){
        model.addAttribute("product",new Product());
        return "ProductForm";
    }
    @RequestMapping(value = "/product_save")
    public String saveProduct(@ModelAttribute Product product,
                              Model model , HttpServletRequest servletRequest){
        List<MultipartFile> files = product.getImages();
        List<String> fileNames = new ArrayList<String>();
        if(files != null && files.size() > 0 ){
            for(MultipartFile multipartFile: files){
                String fileName = multipartFile.getOriginalFilename();
                fileNames.add(fileName);

                File imageFile = new File(servletRequest.getServletContext().getRealPath("/images"),fileName);

                try{
                    multipartFile.transferTo(imageFile);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
        model.addAttribute("product",product);
        return "ProductDetails";
    }
}
