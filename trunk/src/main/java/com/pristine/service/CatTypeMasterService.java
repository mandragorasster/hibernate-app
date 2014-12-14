package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.CatTypeMasterDao;
import com.pristine.domain.CategoryTypeMasterEntity;

@Service("catTypeMasterService")
@Transactional
public class CatTypeMasterService implements ICatTypeMasterService{

	@Autowired
	private CatTypeMasterDao catTypeMasterDao;

	@Override
	public Integer createCategoryType(CategoryTypeMasterEntity categoryType) {
		catTypeMasterDao.add(categoryType);
		return categoryType.getCatTypeId();
	}

	@Override
	public Integer updateCategoryType(CategoryTypeMasterEntity categoryType) {
		catTypeMasterDao.update(categoryType);
		return categoryType.getCatTypeId();
	}

	@Override
	public void deleteCategoryType(CategoryTypeMasterEntity categoryType) {
		catTypeMasterDao.remove(categoryType);
		
	}

	@Override
	public CategoryTypeMasterEntity getCategoryTypeById(Integer id) {
		return catTypeMasterDao.find(id);
	}
	
	
}
