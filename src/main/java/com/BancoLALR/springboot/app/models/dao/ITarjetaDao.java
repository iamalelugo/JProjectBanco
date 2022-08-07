package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.BancoLALR.springboot.app.models.entity.Tarjeta;

@Component
public interface ITarjetaDao {
	
	public List<Tarjeta> findAll();
	
	public void save (Tarjeta tarjeta);
}
