package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Publicacion;

public interface IPublicacionDao {

	public void insert(Publicacion pu);

	public List<Publicacion> list();

	public void delete(int id);

	public void Update(Publicacion pu);

	public List<Publicacion> findByNamePublicacion(Publicacion pu);

}
