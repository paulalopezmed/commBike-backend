package es.upm.dit.isst.commBike.dao;


import es.upm.dit.isst.commBike.model.registro;

import java.util.List;

public interface registroDAO {
	
	public registro create (registro record); 
	
	public registro read (String registroCode);

	public registro update(registro record);

	public registro delete(registro record);
	
	public List<registro> readAll();

	public List<registro> readAll(String usuario);
	
	
}