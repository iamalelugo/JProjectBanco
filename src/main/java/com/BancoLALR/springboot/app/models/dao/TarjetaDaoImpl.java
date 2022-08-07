package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BancoLALR.springboot.app.models.entity.Tarjeta;

@Service
public class TarjetaDaoImpl implements ITarjetaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional (readOnly = true)
	public List<Tarjeta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		
		if(tarjeta != null && tarjeta.getIdTarjeta() > 0)
			em.merge(tarjeta);
		else
			em.persist(tarjeta);
		
	}

}
