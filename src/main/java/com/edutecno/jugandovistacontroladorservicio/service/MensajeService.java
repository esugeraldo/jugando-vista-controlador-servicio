package com.edutecno.jugandovistacontroladorservicio.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.jugandovistacontroladorservicio.model.Mensaje;
import com.edutecno.jugandovistacontroladorservicio.repository.MensajeRepository;

@Service
public class MensajeService {

	@Autowired
	private MensajeRepository mensajeRepository;
	
	public List<Mensaje> listar(){
		return mensajeRepository.listar();
	}
	
	public List<Mensaje> filtrar(String criterioOrigen){
		List<Mensaje> mensajes = mensajeRepository.listar().stream()
			.filter(mensaje -> mensaje.getOrigen().equals(criterioOrigen))
			.collect(Collectors.toList());
		return mensajes;
	}
	
}
