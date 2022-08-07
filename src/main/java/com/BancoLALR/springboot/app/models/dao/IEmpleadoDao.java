package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.BancoLALR.springboot.app.models.entity.Empleado;

@Component
public interface IEmpleadoDao {
	
	public List<Empleado> findAll();
	
	public void save (Empleado empleado);
}
