package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Musico;

public interface IMusicoDao {

	public void insert(Musico m);

	public List<Musico> list();

	public void delete(int id);

	public void update(Musico m);

	public List<Musico> findByNameCodigo(Musico m);
}
