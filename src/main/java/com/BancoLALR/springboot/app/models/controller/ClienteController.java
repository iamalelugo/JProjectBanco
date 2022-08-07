package com.BancoLALR.springboot.app.models.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.BancoLALR.springboot.app.models.dao.IClienteDao;



@Controller
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired 
	private IClienteDao clienteDao;
	
	@GetMapping
	@RequestMapping (value = "/lista", method = RequestMethod.GET)
	public String TarjetaLista(Model model) {
		
		model.addAttribute("titulo", "lista de clientes");
		model.addAttribute("clientes", clienteDao.findAll());
		return "lista";
		
	}
	
}
