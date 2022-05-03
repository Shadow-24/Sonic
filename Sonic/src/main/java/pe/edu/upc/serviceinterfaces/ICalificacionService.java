package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Calificacion;

public interface ICalificacionService {
	
	public void insert(Calificacion cal);
	
	public List<Calificacion> list();

	public List<Calificacion> findByNameCalificacion(Calificacion cal);
	
	public void delete(int id);
}
