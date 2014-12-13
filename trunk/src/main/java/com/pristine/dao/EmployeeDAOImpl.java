package com.pristine.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pristine.domain.EmployeeEntity;
import com.pristine.util.GenericDaoImpl;

@Repository("employeeDAO")
public class EmployeeDAOImpl extends GenericDaoImpl<EmployeeEntity, String> implements EmployeeDAO {

	//@Autowired
	//private SessionFactory sessionFactory;

	@Override
	public void persistEmployee(EmployeeEntity employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	@Override
	public EmployeeEntity findEmployeeById(String id) {
		return (EmployeeEntity) sessionFactory.getCurrentSession().get(EmployeeEntity.class, id);
	}

	@Override
	public void updateEmployee(EmployeeEntity employee) {
		sessionFactory.getCurrentSession().update(employee);

	}
	@Override
	public void deleteEmployee(EmployeeEntity employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

}