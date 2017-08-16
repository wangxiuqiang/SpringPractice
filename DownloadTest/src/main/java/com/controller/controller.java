package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Created by wxq on 17-8-16.
 */
@Controller
public class controller {

    @RequestMapping(value="/image_get/{id}",method = RequestMethod.GET )
    public void getImage(@PathVariable String id , HttpServletRequest request , HttpServletResponse response ,
                         @RequestHeader String referer) {
        if (referer != null) {
            String imageDirectory = request.getServletContext().getRealPath("/WEB-INF/image");
            File file = new File(imageDirectory, id+".jpg");
            if(file.exists()){
                response.setContentType("image/jpg");
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;

                try{
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while(i != -1){
                        os.write(buffer,0,i);
                        i = bis.read(buffer);
                    }
                }catch (Exception e){
                    System.out.println(e.toString());
                }finally {
                    if(bis != null){
                        try{
                            bis.close();
                        }catch (Exception e){

                        }
                    }
                    if (fis != null ){
                        try {
                            fis.close();
                        }catch (Exception e){

                        }
                    }
                }
            }
        }
    }
}
