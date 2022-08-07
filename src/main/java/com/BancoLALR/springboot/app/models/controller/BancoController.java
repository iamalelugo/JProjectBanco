package com.BancoLALR.springboot.app.models.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BancoLALR.springboot.app.models.dao.IBancoDao;


@Controller
@RequestMapping ("/Banco")
public class BancoController {
	
	@Autowired 
	private IBancoDao bancoDao;
	
	@GetMapping
	@RequestMapping (value = "/lista", method = RequestMethod.GET)
	public String BancoLista (Model model) {
		
		model.addAttribute("titulo", "lista de bancos");
		model.addAttribute("bancos", bancoDao.findAll());
		return "lista";
		
	}
	
	

}
