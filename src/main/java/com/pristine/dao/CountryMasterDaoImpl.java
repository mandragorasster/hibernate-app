package com.pristine.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pristine.domain.CountryMasterEntity;
import com.pristine.util.GenericDaoImpl;

@Repository("countryMasterDao")
public class CountryMasterDaoImpl extends GenericDaoImpl<CountryMasterEntity, Integer>implements
		ICountryMasterDao {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;
	/*
	@Override
	public CountryMasterEntity getCountryMaster(Integer id) {

		CountryMasterEntity countryMaster = (CountryMasterEntity) sessionFactory.getCurrentSession().get(CountryMasterEntity.class, id);;
		return countryMaster;
	}

	@Override
	public void deleteCountryMaster(CountryMasterEntity countryMaster) {
		sessionFactory.getCurrentSession().delete(countryMaster);

	}

	@Override
	public void updateCountryMaster(CountryMasterEntity countryMaster) {

		Session session = sessionFactory.getCurrentSession();
		session.update(countryMaster);

	}

	@Override
	public Integer createCountryMaster(CountryMasterEntity countryMaster) {
		Session session = sessionFactory.getCurrentSession();
		session.save(countryMaster);

		return countryMaster.getId();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StateMasterEntity> getStatesByCountryId(Integer countryId) {

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		String queryString = "from com.pristine.domain.StateMaster s where s.countryMaster.id="
				+ countryId;

		List<StateMasterEntity> list = session.createQuery(queryString).list();
		session.getTransaction().commit();
		return list;
	}

*/}
