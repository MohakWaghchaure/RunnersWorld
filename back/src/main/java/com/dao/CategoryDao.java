package com.dao;

import java.util.List;

import com.model.Category;

public interface CategoryDao {

	public boolean insertCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public List<Category> ListCategory();
}
