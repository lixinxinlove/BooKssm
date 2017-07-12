package com.lee.web;

import com.lee.entity.User;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by android on 2017/6/28.
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    private String saveFile(@RequestParam(value = "file", required = false) MultipartFile file, String fileName, HttpServletRequest request) {

        System.out.println("开始");
        String path = request.getSession().getServletContext().getRealPath("upload");
        String file_name = file.getOriginalFilename();
        System.out.println(path);
        File targetFile = new File(path, file_name);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }
}
