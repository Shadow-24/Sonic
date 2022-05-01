package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Marca;

public interface IMarcaDao {
	public void insert(Marca m);

	public List<Marca> list();
	
	public void delete(int id);
	
	public void update (Marca m);
	
	public List<Marca> findByNameMarca(Marca m);
}
