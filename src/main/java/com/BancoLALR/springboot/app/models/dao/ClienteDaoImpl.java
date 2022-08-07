package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BancoLALR.springboot.app.models.entity.Cliente;

@Service
public class ClienteDaoImpl implements IClienteDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional (readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
		if(cliente != null && cliente.getIdCliente() > 0) {
			em.merge(cliente);
		}
		else
			em.persist(cliente);
	}

}
