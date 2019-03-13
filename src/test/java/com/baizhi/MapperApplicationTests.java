package com.baizhi;

import com.baizhi.dao.AdminDao;
import com.baizhi.dao.ImguploadDao;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Imgupload;
import com.baizhi.service.ImguploadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperApplicationTests {
    @Autowired
    private ImguploadService imguploadService;
    @Test
    public void contextLoads() {
        Imgupload imgupload = new Imgupload();
        String uuid = UUID.randomUUID().toString();
        imgupload.setId(uuid);
        imgupload.setImg("4");
        imgupload.setName("xiaopangzi");
        imgupload.setUrl("/1.jpg");
        imguploadService.addImg(imgupload);
        System.out.println("ssssddd");
        System.out.println("sssdd");
    }

}
