package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Calificacion;

public interface ICalificacionDao {
	
	public void insert(Calificacion ca);

	public List<Calificacion> list();
	
	public List<Calificacion> findByNameCalificacion(Calificacion ca);

}
