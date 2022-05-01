package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.TipoInstrumento;

public interface ITipoInstrumentoDao {
	public void insert(TipoInstrumento ti);

	public List<TipoInstrumento> list();

	public void delete(int id);

	public void update(TipoInstrumento ti);

	public List<TipoInstrumento> findByNameTipoInstrumento(TipoInstrumento ti);
}
