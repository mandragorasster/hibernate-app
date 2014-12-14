package com.pristine.dao;

import com.pristine.domain.MedicineMasterEntity;
import com.pristine.util.GenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository("medicineMasterDao")
public class MedicineMasterDaoImpl extends GenericDaoImpl<MedicineMasterEntity, Integer> 
		implements IMedicineMasterDao{

}
