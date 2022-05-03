package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Marca;

public interface IMarcaService {
	public void insert(Marca m);

	public List<Marca> list();

	public void delete(int id);

	public void update(Marca m);

	public List<Marca> findByNameMarca(Marca m);
}
