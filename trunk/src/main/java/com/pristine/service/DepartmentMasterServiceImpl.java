package com.pristine.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pristine.dao.IDepartmentMasterDao;
import com.pristine.domain.DepartmentMasterEntity;
import com.pristine.util.EntityToVOConverter;
import com.pristine.util.VOToEntityConverter;
import com.pristine.vo.DepartmentMasterVO;


@Service("departmentMasterService")
@Transactional
public class DepartmentMasterServiceImpl implements IDepartmentMasterService {

	@Autowired
	private IDepartmentMasterDao departmentMasterDao;
	
	@Override
	public Integer addDepartment(DepartmentMasterVO departmentMasterVO) {
		DepartmentMasterEntity departmentMaster = VOToEntityConverter.convert(departmentMasterVO);
		departmentMasterDao.add(departmentMaster );
		return departmentMaster.getDeptId();
		
	}

	@Override
	public void updateDepartment(DepartmentMasterVO departmentMasterVO) {
		DepartmentMasterEntity departmentMaster = VOToEntityConverter.convert(departmentMasterVO);
		departmentMasterDao.update(departmentMaster);
		
	}

	@Override
	public void removeDepartment(DepartmentMasterVO departmentMasterVO) {
		DepartmentMasterEntity departmentMaster = VOToEntityConverter.convert(departmentMasterVO);
		departmentMasterDao.remove(departmentMaster);
	}

	@Override
	public DepartmentMasterVO findDepartment(Integer id) {
		DepartmentMasterEntity departmentMaster = departmentMasterDao.find(id);
		DepartmentMasterVO departmentMasterVO = EntityToVOConverter.convert(departmentMaster);
		return departmentMasterVO;
	}

	@Override
	public List<DepartmentMasterVO> list() {
		List<DepartmentMasterEntity> list = departmentMasterDao.list();
		List<DepartmentMasterVO> voList= new ArrayList<DepartmentMasterVO>();
		if(CollectionUtils.isNotEmpty(list)){
			for(DepartmentMasterEntity entity:list){
				DepartmentMasterVO vo = EntityToVOConverter.convert(entity);
				voList.add(vo);
			}
		}
		return voList;
	}
	
	
	
}
