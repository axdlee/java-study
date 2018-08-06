package com.yeelight.service;

import java.util.List;

import com.yeelight.pojo.Category;

public interface CategoryService {

	List<Category> list();

	void add(Category category);

	void update(Category category);

	void delete(Category category);

	Category get(int id);
}
