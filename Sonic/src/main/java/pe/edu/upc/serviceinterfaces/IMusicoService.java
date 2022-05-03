package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Musico;

public interface IMusicoService {

	public void insert(Musico m);

	public List<Musico> list();

	public void delete(int id);

	public void update(Musico m);

	public List<Musico> findByNamePublicacion(Musico m);

}
