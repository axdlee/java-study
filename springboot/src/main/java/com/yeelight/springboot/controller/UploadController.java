package com.yeelight.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-7
 * Time: 上午10:32
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Controller
public class UploadController {

    @RequestMapping("/uploadPage")
    public String uploadPage() {
        return "uploadPage";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest res, @RequestParam(name = "file") MultipartFile file, Model model) {
        try {
            String fileName = System.currentTimeMillis() + file.getOriginalFilename();
            String destFileName = res.getServletContext().getRealPath("") + "uploaded" + File.separator + fileName;

            File destFile = new File(destFileName);
            destFile.getParentFile().mkdirs();
            file.transferTo(destFile);

            model.addAttribute("fileName", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败：" + e.getMessage();
        }
        return "showImg";
    }
}
