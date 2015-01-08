package com.sanroman.accesodatos.hibernate.catalogo.model;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	private String id;
	private String nombre;
	private double precio;
	private URL infoURL;
	private Proveedor proveedor;
	
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public URL getInfoURL() {
		return infoURL;
	}
	public void setInfoURL(URL infoURL) {
		this.infoURL = infoURL;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}
