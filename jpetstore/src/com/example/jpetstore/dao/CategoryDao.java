package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Category;

public interface CategoryDao {

	List<Category> getCategoryList() throws DataAccessException;

	Category getCategory(String categoryId) throws DataAccessException;
	
	/*좋아요 인기리스트 기능*/
	List<Category> selectBestCategoryList(String categoryId) throws DataAccessException;
	List<Category> selectBestList() throws DataAccessException;
	/*좋아요 인기리스트 기능*/
}
