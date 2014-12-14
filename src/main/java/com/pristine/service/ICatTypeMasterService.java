package com.pristine.service;

import com.pristine.domain.CategoryTypeMasterEntity;


public interface ICatTypeMasterService{
	public Integer createCategoryType(CategoryTypeMasterEntity categoryType);
	
	public Integer updateCategoryType(CategoryTypeMasterEntity categoryType);
	
	public void deleteCategoryType(CategoryTypeMasterEntity categoryType);
	
	public CategoryTypeMasterEntity getCategoryTypeById(Integer id);
}
