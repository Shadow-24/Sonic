package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Dueño;

public interface IDueñoService {
	
	public void insert(Dueño d);
	
	public List<Dueño> list();
	
	public void delete(int id);
	
	public void update(Dueño du);
	
	public List<Dueño> findByNameDueño(Dueño d);


}
