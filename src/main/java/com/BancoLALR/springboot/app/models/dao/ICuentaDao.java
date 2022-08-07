package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.BancoLALR.springboot.app.models.entity.Cuenta;

@Component
public interface ICuentaDao {
	
	public List<Cuenta> findAll();
	
	public void save(Cuenta cuenta);
}
