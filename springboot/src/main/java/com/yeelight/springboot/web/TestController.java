package com.yeelight.springboot.web;

import com.yeelight.springboot.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-7
 * Time: 下午2:38
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model model) {
        String htmlContent = "<p style='color:red'>红色文字</>";
        Product currentProduct = new Product(5, "product e", 200);

        model.addAttribute("htmlContent", htmlContent);
        model.addAttribute("currentProduct", currentProduct);
        return "test";
    }
}
