package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Estudio;

public interface IEstudioDao {

	public void insert(Estudio e);

	public List<Estudio> list();

	public void delete(int id);
	
	public List<Estudio> findByNameEstudio(Estudio e);
}
