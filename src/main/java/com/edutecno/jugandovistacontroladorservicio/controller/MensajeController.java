package com.edutecno.jugandovistacontroladorservicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.edutecno.jugandovistacontroladorservicio.service.MensajeService;

//Generar un software web que permita desde un archivo txt capturar los datos del documento
//y mostrarlos en una tabla dentro de una página web, luego de que se listan por primera vez
//se le debe dar la opción al usuario para que pueda filtrar por origen

@Controller
@RequestMapping("/mensajes")
public class MensajeController {

	@Autowired
	MensajeService mensajeService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model modelo) {
		modelo.addAttribute("mensajes", mensajeService.listar());
		return "listar";
	}
	
	@RequestMapping(value = "/filtrar", method = RequestMethod.POST)
	public String filtrar(@RequestParam String origen, Model modelo) {
		if(origen.equals("")) {
			modelo.addAttribute("mensajes", mensajeService.listar());
		}else {
			modelo.addAttribute("mensajes", mensajeService.filtrar(origen));
		}
		return "listar";
	}
	
}
