package es.upm.dit.isst.commBike.dao;
import es.upm.dit.isst.commBike.model.bicicleta;

import java.util.List;

public interface bicicletaDAO {
	
	public bicicleta create (bicicleta bike); 
	
	public bicicleta read (String bikeCode);

	public bicicleta update(bicicleta bike);

	public bicicleta delete(bicicleta bike);
	
	public List<bicicleta> readAll();

	public List<bicicleta> readAll(String usuario);
	
	
}








