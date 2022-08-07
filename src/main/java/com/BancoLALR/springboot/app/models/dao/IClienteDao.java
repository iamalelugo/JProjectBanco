package com.BancoLALR.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.BancoLALR.springboot.app.models.entity.Cliente;

@Component
public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	public void save (Cliente cliente);

}
