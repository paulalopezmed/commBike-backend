package es.upm.dit.isst.commBike.dao;



import es.upm.dit.isst.commBike.model.bicicleta;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.commBike.dao.SessionFactoryService;;

public class bicicletaDAOImplementation {
	private static  bicicletaDAOImplementation instancia = null;

	  private bicicletaDAOImplementation() {

	  }


	 public static bicicletaDAOImplementation getInstance() {

	    if( null == instancia )

	      instancia = new bicicletaDAOImplementation();

	    return instancia;

	  }
	 

		
		
		public bicicleta read (String bikeCode) {
		
		  Session session = SessionFactoryService.get().openSession();
		
		  session.beginTransaction();
		
		  
		  
		 bicicleta bike = session.get(bicicleta.class, bikeCode);
		
		  session.getTransaction().commit();
		
		  session.close();
		
		  return bike;
		}
		public bicicleta create (bicicleta bike) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  bicicleta bicicleta = null;
			  
			 session.save(bike);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return bicicleta;
			}
		public bicicleta update (bicicleta bike) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  bicicleta bicicleta = null;
			  
			 session.saveOrUpdate(bike);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return bicicleta;
			}
		public bicicleta delete (bicicleta bike) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  bicicleta bicicleta = null;
			  
			 session.delete(bike);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return bicicleta;
			}
		@SuppressWarnings("unchecked")
		public List<bicicleta> readAll () {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  ArrayList<bicicleta> bicicletas = new ArrayList<bicicleta>(); 
			  
			  bicicletas.addAll(session.createQuery("from bicicleta").list());
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return bicicletas;
			}
		@SuppressWarnings("unchecked")

		public List<bicicleta> readAll (String usuario) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  List<bicicleta> bicicletas = null;
			  
			  bicicletas =  session.createQuery("from bicicleta").list();
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return bicicletas;
			}
		
		

}
