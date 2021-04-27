package es.upm.dit.isst.commBike.dao;




import es.upm.dit.isst.commBike.model.registro;

import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.commBike.dao.SessionFactoryService;;

public class registroDAOImplementation {
	private static  registroDAOImplementation instancia = null;

	  private registroDAOImplementation() {

	  }


	 public static registroDAOImplementation getInstance() {

	    if( null == instancia )

	      instancia = new registroDAOImplementation();

	    return instancia;

	  }
	 

		
		
		public registro read (String registroCode) {
		
		  Session session = SessionFactoryService.get().openSession();
		
		  session.beginTransaction();
		
		  registro registro = null;
		  
		  session.get(registro.class, registroCode);
		
		  session.getTransaction().commit();
		
		  session.close();
		
		  return registro;
		}
		public registro create (registro record) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  registro registro = null;
			  
			 session.save(record);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return registro;
			}
		public registro update (registro record) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  registro registro = null;
			  
			 session.saveOrUpdate(record);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return registro;
			}
		public registro delete (registro record) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  registro registro = null;
			  
			 session.delete(record);
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return registro;
			}
		public List<registro> readAll () {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  List<registro> registro = null;
			  
			 session.createQuery("from registro").list();
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return registro;
			}
		public List<registro> readAll (String usuario) {
			
			  Session session = SessionFactoryService.get().openSession();
			
			  session.beginTransaction();
			
			  List<registro> record = null;
			  
			 session.createQuery("from registro").list();
			
			  session.getTransaction().commit();
			
			  session.close();
			
			  return record;
			}
		
		

}
