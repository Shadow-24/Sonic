package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoDao {
	public void insert(Distrito d);
	
	public List<Distrito> list();
	
}
