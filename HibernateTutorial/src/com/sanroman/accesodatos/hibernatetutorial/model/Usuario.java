package com.sanroman.accesodatos.hibernatetutorial.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Usuario {
	@Id
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String name;	
	@Embedded
	@AttributeOverrides(value = {
		@AttributeOverride(name="tipoVia", column = @Column(name="tipo_via_dom1")),
		@AttributeOverride(name="nombreVia", column = @Column(name="nombre_via_dom1")),
		@AttributeOverride(name="numero", column = @Column(name="numero_via_dom1")),
		@AttributeOverride(name="codigoPostal", column = @Column(name="zip_dom1"))
	})
	private Domicilio domicilioPrincipal;
	@Embedded
	@AttributeOverrides(value = {
		@AttributeOverride(name="tipoVia", column = @Column(name="tipo_via_dom2")),
		@AttributeOverride(name="nombreVia", column = @Column(name="nombre_via_dom2")),
		@AttributeOverride(name="numero", column = @Column(name="numero_via_dom2")),
		@AttributeOverride(name="codigoPostal", column = @Column(name="zip_dom2"))
	})
	private Domicilio domicilioSecundario;
	@Column(name="user_email")
	private String email;
	@Column(name="user_telefono")
	private String telefono;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Domicilio getDomicilioPrincipal() {
		return domicilioPrincipal;
	}
	public void setDomicilioPrincipal(Domicilio domicilioPrincipal) {
		this.domicilioPrincipal = domicilioPrincipal;
	}
	public Domicilio getDomicilioSecundario() {
		return domicilioSecundario;
	}
	public void setDomicilioSecundario(Domicilio domicilioSecundario) {
		this.domicilioSecundario = domicilioSecundario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void print() {
		System.out.println("User[id: "+ id +", nombre: " + name + ", domicilio principal: " 
	+ domicilioPrincipal.toString() + ", domicilio secundario: " + domicilioSecundario.toString() + "]");
		
	}
	
	
}