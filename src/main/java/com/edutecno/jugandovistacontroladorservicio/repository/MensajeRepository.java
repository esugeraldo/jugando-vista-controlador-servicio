package com.edutecno.jugandovistacontroladorservicio.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.edutecno.jugandovistacontroladorservicio.model.Mensaje;

@Repository
public class MensajeRepository {

	public List<Mensaje> listar(){
		File archivo = new File("src/main/resources/static/mensajes.txt");
		List<Mensaje> mensajes = new ArrayList<>();
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea != null) {
				String[] cadenas = linea.split(",");
				Mensaje mensaje = new Mensaje();
				mensaje.setId(cadenas[0]);
				mensaje.setNombre(cadenas[1]);
				mensaje.setMensaje(cadenas[2]);
				mensaje.setOrigen(cadenas[3]);
				mensajes.add(mensaje);
				linea = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensajes;
	}
	
}
