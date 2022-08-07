package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BancoLALR.springboot.app.models.entity.Empleado;

@Service
public class EmpleadoDaoImpl implements IEmpleadoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional (readOnly = true)
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Empleado empleado) {
		// TODO Auto-generated method stub
		
		if(empleado != null && empleado.getIdEmpleado() > 0)
			em.merge(empleado);
		else
			em.persist(empleado);
	}

}
