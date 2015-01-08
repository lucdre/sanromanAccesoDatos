package com.sanroman.accesodatos.hibernatetutorial.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernatetutorial.model.Usuario;

public class InsertarUsuarioTest {

	public static void main(String[] args) {
		Session session=null;
		Configuration cfg=new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		System.out.println("Iniciando sesion Hibernate...");
		session=factory.openSession();
		System.out.println("Sesion Hibernate iniciada...");
		Transaction tr=session.beginTransaction();
		Usuario user=new Usuario();
		user.setId(34);
		user.setDomicilio("Calle luna 22");
		user.setEmail("luis@gmail.com");
		user.setName("Jose");
		user.setTelefono("913345566");
		session.save(user);
		tr.commit();
		session.close();
		System.out.println("Cerrando sesion Hibernate...");
	}

}
