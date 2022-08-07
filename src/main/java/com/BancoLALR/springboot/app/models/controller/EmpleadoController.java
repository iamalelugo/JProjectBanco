package com.BancoLALR.springboot.app.models.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BancoLALR.springboot.app.models.dao.IEmpleadoDao;

@Controller
@RequestMapping("/Empleado")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@GetMapping
	@RequestMapping (value = "/lista", method = RequestMethod.GET)
	public String EmpleadoLista (Model model) {
		
		model.addAttribute("titulo", "lista de empleados");
		model.addAttribute("empleados", empleadoDao.findAll());
		return "lista";
		
	}
}
