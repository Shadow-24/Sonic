package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Due�o;

public interface IDue�oService {
	
	public void insert(Due�o d);
	
	public List<Due�o> list();
	
	public void delete(int id);
	
	public void update(Due�o du);
	
	public List<Due�o> findByNameDue�o(Due�o d);


}
