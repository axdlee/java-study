package com.yeelight.controller;

import com.yeelight.pojo.Category;
import com.yeelight.service.CategoryService;
import com.yeelight.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 上午10:16
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page) {
        ModelAndView mav = new ModelAndView();
        List<Category> cs = categoryService.list(page);
        int total = categoryService.total();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }
}
