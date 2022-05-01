package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.TipoInstrumento;

public interface ITipoInstrumentoService {
	public void insert(TipoInstrumento ti);

	public List<TipoInstrumento> list();

	public void delete(int id);

	public void update(TipoInstrumento ti);

	public List<TipoInstrumento> findByNameTipoInstrumento(TipoInstrumento ti);
}
