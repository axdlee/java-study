package com.yeelight.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yeelight.springboot.dao.CategoryDAO;
import com.yeelight.springboot.mapper.CategoryMapper;
import com.yeelight.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 下午7:08
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryDAO categoryDAO;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/listCategory")
    public String listCategory(
            Model model,
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "size", defaultValue = "5") int size
            ) throws Exception{
        /*start = start < 0 ? 0 : start;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size, sort);
        Page<Category> page = categoryDAO.findAll(pageable);*/

        PageHelper.startPage(start, size, "id desc");
        List<Category> cs = categoryMapper.findAll();
        PageInfo<Category> page = new PageInfo<>(cs);

        //List<Category> cs = categoryDAO.findAll();
        //List<Category> cs1 = categoryMapper.findAll();

        //model.addAttribute("cs", cs);
        //model.addAttribute("cs1", cs1);
        model.addAttribute("page", page);

        return "listCategory";
    }

    @RequestMapping("/addCategory")
    public String addCategory(Category category) throws Exception {
        //categoryDAO.save(category);
        categoryMapper.save(category);
        return "redirect:listCategory";
    }

    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category category)  throws Exception  {
        //categoryDAO.delete(category);
        categoryMapper.delete(category.getId());
        return "redirect:listCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(Category category)  throws Exception  {
        //categoryDAO.save(category);
        categoryMapper.update(category);
        return "redirect:listCategory";
    }

    @RequestMapping("/editCategory")
    public String editCategory(int id, Model model)  throws Exception  {
        //Category category = categoryDAO.getOne(id);
        Category category = categoryMapper.get(id);
        model.addAttribute("c", category);
        return "editCategory";
    }
}
