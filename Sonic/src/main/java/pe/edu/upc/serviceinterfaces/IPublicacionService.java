package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Publicacion;

public interface IPublicacionService {

	public void insert(Publicacion pu);

	public List<Publicacion> list();

	public void delete(int id);

	public void update(Publicacion pu);

	public List<Publicacion> findByNamePublicacion(Publicacion pu);

}
