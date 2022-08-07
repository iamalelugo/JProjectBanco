package com.BancoLALR.springboot.app.models.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BancoLALR.springboot.app.models.dao.ICuentaDao;

@Controller
@RequestMapping("/Cuenta")
public class CuentaController {
	
	@Autowired
	private ICuentaDao cuentaDao;
	
	@GetMapping
	@RequestMapping (value = "/lista", method = RequestMethod.GET)
	public String cuentaLista(Model model) {
		
		model.addAttribute("titulo", "Lista de cuentas");
		model.addAttribute("cuentas", cuentaDao.findAll());
		return "lista";
		
	}
}
