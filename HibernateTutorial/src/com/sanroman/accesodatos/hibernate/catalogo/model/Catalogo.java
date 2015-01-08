package com.sanroman.accesodatos.hibernate.catalogo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

public class Catalogo {
	
	@Id
	private String id;
	private String nombre;
	private List<Producto> productos = new ArrayList<Producto>();
	
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}
