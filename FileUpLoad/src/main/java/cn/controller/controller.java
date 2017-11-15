package cn.controller;

import cn.po.fileTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class controller {

        @RequestMapping(value = "/start")
        public String StartClass() {
            return "index";

}

    @RequestMapping("/file")
    public String file(Model model ,MultipartFile fileName) throws Exception{
        String originalFileName = fileName.getOriginalFilename();
        fileTest fileTest = new fileTest();
        if(fileName != null && originalFileName != null && originalFileName.length() > 0)
        {
//            获取图片存取的物理路径
            String pic_path = "/home/wangxiuqiang/tomcat_PictureMkdir/pic/";

//            给赋予新的文件名 ,随机起名 加上后缀
            String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));

//         定义取新的文件
            File newFile = new File(pic_path + newFileName);

//            将内存中文件存放到磁盘 ,
            fileName.transferTo(newFile);



            fileTest.setFileName(newFileName);

        }
        model.addAttribute("fileTest",fileTest);
       return "success";
    }

}
