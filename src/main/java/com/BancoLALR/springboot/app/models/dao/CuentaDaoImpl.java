package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BancoLALR.springboot.app.models.entity.Cuenta;

@Service
public class CuentaDaoImpl implements ICuentaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional (readOnly = true)
	public List<Cuenta> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from cuentas").getResultList();
	}
	
	@Override
	public void save(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
		if(cuenta != null  && cuenta.getIdCuenta() > 0) {
			em.merge(cuenta);
		}
		else {
			em.persist(cuenta);
		}
		
	}

}
