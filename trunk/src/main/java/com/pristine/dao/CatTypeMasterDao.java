package com.pristine.dao;

import org.springframework.stereotype.Repository;

import com.pristine.domain.CategoryTypeMasterEntity;
import com.pristine.util.GenericDaoImpl;

@Repository("catTypeMasterDao")
public class CatTypeMasterDao extends
		GenericDaoImpl<CategoryTypeMasterEntity, Integer> implements
		ICatTypeMasterDao {

	
}
