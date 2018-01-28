package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class Filecontroller {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    /**
     * 使用  @RequestPart 将表单中的name为pic的传过来,以数组的形式放在
     * multipartFile参数中
     * @param model
     * @param multipartFile
     * @return
     */
    @RequestMapping("/picture")
    public String picture(Model model, @RequestPart("pic") MultipartFile[] multipartFile){
        try {
            int a = 0;
            System.out.println(multipartFile.length);
            String originalName;
            for(int i = 0 ;i < multipartFile.length;i++ ){
                originalName = multipartFile[i].getOriginalFilename();
                if(multipartFile[i] != null && originalName != null && originalName.length() > 0){
                    String pic_path = "/home/wxq/devel/";
                    String pic_name = UUID.randomUUID()
                            + originalName.substring(originalName.lastIndexOf("."));
                    File file = new File(pic_path + pic_name);
                    multipartFile[i].transferTo(file);
                    System.out.println(1 + "个");
                    a = 1;
                }
                else{
                    System.out.println("0个");
                    a = 0;
                }
            }
            if(a == 1) {
                model.addAttribute("e","好");
            }else{
                model.addAttribute("e","不");
            }
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("ex",e);
        }
        return "success";
    }
}
