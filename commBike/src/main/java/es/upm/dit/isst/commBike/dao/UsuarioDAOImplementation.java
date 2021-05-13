package es.upm.dit.isst.commBike.dao;



import es.upm.dit.isst.commBike.model.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.commBike.dao.SessionFactoryService;

public class UsuarioDAOImplementation {
	private static  UsuarioDAOImplementation instancia = null;

	  private UsuarioDAOImplementation() {

	  }


	 public static UsuarioDAOImplementation getInstance() {

	    if( null == instancia )

	      instancia = new UsuarioDAOImplementation();

	    return instancia;

	  }
	 

		
		
		public Usuario read (String nombre) {
		
		  Session session = SessionFactoryService.get().openSession();
		
		  session.beginTransaction();
		
		  
		  
		  Usuario user = session.get(Usuario.class, nombre);
		
		  session.getTransaction().commit();
		
		  session.close();
		
		  return user;
		}
		public Usuario create (Usuario user) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			  
			  session.save(user);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return user;
			}
		
		public Usuario update (Usuario user) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();				 
			  
			 session.saveOrUpdate(user);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return user;
			}
		public Usuario delete (Usuario user) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			  
			 session.delete(user);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return user;
			}
		@SuppressWarnings("unchecked")
		public List<Usuario> readAll () {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  ArrayList<Usuario> users = new ArrayList<Usuario>(); 
			   
			  users.addAll(session.createQuery("FROM Usuario").list());
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return users;
			}
		@SuppressWarnings("unchecked")

		public List<Usuario> readAll (String nombre) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  List<Usuario> users = null;
			  
			  users =  session.createQuery("FROM Usuario").list();
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return users;
			}
		
		

}