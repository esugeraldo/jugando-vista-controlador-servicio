package com.edutecno.jugandovistacontroladorservicio.model;

public class Mensaje {

	private String id;
	private String nombre;
	private String mensaje;
	private String origen;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nombre=" + nombre + ", mensaje=" + mensaje + ", origen=" + origen + "]";
	}

}
