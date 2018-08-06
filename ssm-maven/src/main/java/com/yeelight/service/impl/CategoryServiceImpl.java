package com.yeelight.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeelight.mapper.CategoryMapper;
import com.yeelight.pojo.Category;
import com.yeelight.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	@Override
	public List<Category> list(){
		return categoryMapper.list();
	}

	@Override
	public void add(Category category) {
		categoryMapper.add(category);
	}

	@Override
	public void update(Category category) {
		categoryMapper.update(category);
	}

	@Override
	public void delete(Category category) {
		categoryMapper.delete(category.getId());
	}

	@Override
	public Category get(int id) {
		Category category = categoryMapper.get(id);
		return category;
	}


}
