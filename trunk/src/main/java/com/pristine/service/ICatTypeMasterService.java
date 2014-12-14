package com.pristine.service;

import com.pristine.vo.CategoryTypeMasterVO;


public interface ICatTypeMasterService{
	public Integer createCategoryType(CategoryTypeMasterVO categoryType);
	
	public Integer updateCategoryType(CategoryTypeMasterVO categoryType);
	
	public void deleteCategoryType(CategoryTypeMasterVO categoryType);
	
	public CategoryTypeMasterVO getCategoryTypeById(Integer id);
}
