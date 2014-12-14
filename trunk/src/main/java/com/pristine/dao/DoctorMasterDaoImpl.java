package com.pristine.dao;

import com.pristine.domain.DoctorMasterEntity;
import com.pristine.util.GenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository("doctorMasterDao")
public class DoctorMasterDaoImpl extends GenericDaoImpl<DoctorMasterEntity, Integer> 
		implements IDoctorMasterDao{

}
