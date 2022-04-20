package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Estudio;

public interface IEstudioService {

	public void insert(Estudio es);

	public List<Estudio> list();

	public void delete(int id);

}
