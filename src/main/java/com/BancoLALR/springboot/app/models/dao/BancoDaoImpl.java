package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BancoLALR.springboot.app.models.entity.Banco;

@Service 
public class BancoDaoImpl implements IBancoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional (readOnly = true)
	public List<Banco> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Banco banco) {
		// TODO Auto-generated method stub
		
		if(banco != null && banco.getIdBanco() > 0)
			em.merge(banco);
		else
			em.persist(banco);
	}

}
