package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Instrumento;

public interface IInstrumentoService {

	public void insert(Instrumento i);

	public List<Instrumento> list();

	public void delete(int id);

	public void update(Instrumento i);

	public List<Instrumento> findByNameInstrumento(Instrumento i);

}
