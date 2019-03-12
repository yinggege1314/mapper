package com.baizhi.controller;

import com.baizhi.entity.Imgupload;
import com.baizhi.service.ImguploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/img")
public class ImguploadController {
    @Autowired
    private ImguploadService imguploadService;

    @RequestMapping("/addimg")
    public void addimg(Imgupload img,MultipartFile upFile, HttpSession session) throws Exception {
        String originalFilename=upFile.getOriginalFilename();//
        String realPath=session.getServletContext().getRealPath("/upFile");//
        upFile.transferTo(new File(realPath+"\\"+originalFilename));//
        img.setUrl("upFile/"+originalFilename);
        imguploadService.addImg(img);
    }
}
