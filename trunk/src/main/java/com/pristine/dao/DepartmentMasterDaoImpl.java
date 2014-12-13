package com.pristine.dao;

import org.springframework.stereotype.Repository;

import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.util.GenericDaoImpl;


@Repository("departmentMasterDao")
public class DepartmentMasterDaoImpl extends GenericDaoImpl<DepartmentMasterEntity, Integer>implements IDepartmentMasterDao{

}
