package com.sanroman.accesodatos.hibernate.catalogo.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernate.catalogo.model.Producto;
import com.sanroman.accesodatos.hibernate.catalogo.model.Proveedor;

public class InsertarTest {
	
	public static void main(String[] args) {
		Session session=null;
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		System.out.println("Iniciando sesion Hibernate...");
		session=factory.openSession();
		System.out.println("Sesion Hibernate iniciada...");
		Transaction tr=session.beginTransaction();
		Proveedor proveedor = new Proveedor();
		proveedor.setId("proveedor1");
		proveedor.setTelefono("996774554");
		proveedor.setNombre("Juan Jose");
		proveedor.setEmail("juanjo@gmail.com");
		session.save(proveedor);
		
		Producto producto = new Producto();
		producto.setId("LG_Mon1");
		producto.setNombre("Monitor LG 23p");
		producto.setPrecio(101.23);
		try {
			producto.setInfoURL(new URL("http://www.fnac.es/monitores/lg/LG_23"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		producto.setProveedor(proveedor);
		session.save(producto);
		
		tr.commit();
		session.close();
		System.out.println("Cerrando sesion Hibernate...");
	}

}
