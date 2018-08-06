package com.yeelight.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yeelight.pojo.Category;
import com.yeelight.service.CategoryService;
import com.yeelight.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView list(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();

		page.caculateLast(total);

		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping(value="/category",method=RequestMethod.PUT)
	public ModelAndView addCategory(Category category){
		System.out.println("category.getName():"+category.getName());
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}

	@RequestMapping(value="/category/{id}",method=RequestMethod.DELETE)
	public ModelAndView deleteCategory(Category category){
		categoryService.delete(category);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}
	@RequestMapping(value="/category/{id}",method=RequestMethod.GET)
	public ModelAndView editCategory(Category category){
		Category c= categoryService.get(category.getId());
		ModelAndView mav = new ModelAndView("editCategory");
		System.out.println(c);
		mav.addObject("c", c);
		return mav;
	}
	@RequestMapping(value="/category/{id}",method=RequestMethod.POST)
	public ModelAndView updateCategory(Category category){
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}
}
