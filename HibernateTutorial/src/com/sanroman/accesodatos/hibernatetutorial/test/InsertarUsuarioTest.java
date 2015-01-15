package com.sanroman.accesodatos.hibernatetutorial.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernatetutorial.model.Domicilio;
import com.sanroman.accesodatos.hibernatetutorial.model.Usuario;

public class InsertarUsuarioTest {

	public static void main(String[] args) {
		
		//Instanciar sesion de hibernate
		Session session=null;
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		System.out.println("Iniciando sesion Hibernate...");
		session=factory.openSession();
		System.out.println("Sesion Hibernate iniciada...");
		
		//Iniciamos transaccion
		Transaction tr=session.beginTransaction();
		
		//Domicilio principal
		Domicilio dom1 = new Domicilio();
		dom1.setTipoVia(1);
		dom1.setNombreVia("luna");
		dom1.setCodigoPostal(28020);
		dom1.setNumero(23);
		
		//Domicilio secundario
		Domicilio dom2 = new Domicilio();
		dom2.setTipoVia(2);
		dom2.setCodigoPostal(30022);
		dom2.setNombreVia("sol");
		dom2.setNumero(212);
		
		//Usuario
		Usuario user=new Usuario();
		user.setId(34);
		user.getDomicilios().add(dom1);
		user.getDomicilios().add(dom2);
		user.setEmail("luis@gmail.com");
		user.setName("Jose");
		user.setTelefono("913345566");
		
		session.save(user);
		tr.commit();
		session.close();
		System.out.println("Cerrando sesion Hibernate...");
	}

}
