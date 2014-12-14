package com.pristine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.CatTypeMasterDao;
import com.pristine.domain.CategoryTypeMasterEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.CategoryTypeMasterVO;

@Service("catTypeMasterService")
@Transactional
public class CatTypeMasterService implements ICatTypeMasterService{

	@Autowired
	private CatTypeMasterDao catTypeMasterDao;

	@Override
	public Integer createCategoryType(CategoryTypeMasterVO categoryTypeVO) {
		CategoryTypeMasterEntity categoryType = VOToEntityConverter.convert(categoryTypeVO);
		catTypeMasterDao.add(categoryType);
		return categoryType.getCatTypeId();
	}

	@Override
	public Integer updateCategoryType(CategoryTypeMasterVO categoryTypeVO) {
		CategoryTypeMasterEntity categoryType = VOToEntityConverter.convert(categoryTypeVO);
		catTypeMasterDao.update(categoryType);
		return categoryType.getCatTypeId();
	}

	@Override
	public void deleteCategoryType(CategoryTypeMasterVO categoryTypeVO) {
		CategoryTypeMasterEntity categoryType = VOToEntityConverter.convert(categoryTypeVO);
		catTypeMasterDao.remove(categoryType);
		
	}

	@Override
	public CategoryTypeMasterVO getCategoryTypeById(Integer id) {
		CategoryTypeMasterEntity categoryType = catTypeMasterDao.find(id);
		CategoryTypeMasterVO categoryTypeVO = EntityToVOConverter.convert(categoryType);
		return categoryTypeVO;
	}
	
	
}
