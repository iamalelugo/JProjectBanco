package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.BancoLALR.springboot.app.models.entity.Banco;

@Component
public interface IBancoDao {
	
	public List<Banco> findAll();
	
	public void save (Banco banco);
}
