package com.baizhi.service;

import com.baizhi.dao.ImguploadDao;
import com.baizhi.entity.Imgupload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ImguploadServiceImpl implements  ImguploadService{
    @Autowired
    ImguploadDao imguploadDao;
    @Override
    public void addImg(Imgupload img) {
        String uuid = UUID.randomUUID().toString();
        img.setId(uuid);
        imguploadDao.insert(img);
    }
}
