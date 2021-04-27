package es.upm.dit.isst.commBike.dao;


import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

 
public class SessionFactoryService {


 private SessionFactory sessionFactory;

  private static SessionFactoryService sfs;


 private SessionFactoryService() {

    sessionFactory = new Configuration().configure().buildSessionFactory();

  }
 public static SessionFactory get() {

    if( null == sfs )

      sfs = new SessionFactoryService();

    return sfs.sessionFactory;

  }
public SessionFactory getSessionFactory() {
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
public static SessionFactoryService getSfs() {
	return sfs;
}
public static void setSfs(SessionFactoryService sfs) {
	SessionFactoryService.sfs = sfs;
}
@Override
public boolean equals(Object arg0) {
	// TODO Auto-generated method stub
	return super.equals(arg0);
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

 
}