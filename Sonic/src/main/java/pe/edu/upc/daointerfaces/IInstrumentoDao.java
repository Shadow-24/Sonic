package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Instrumento;

public interface IInstrumentoDao {

	public void insert(Instrumento i);

	public List<Instrumento> list();
	
	public void delete(int id);

}
