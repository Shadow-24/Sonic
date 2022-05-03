package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.ITipoInstrumentoDao;
import pe.edu.upc.entities.TipoInstrumento;
import pe.edu.upc.serviceinterfaces.ITipoInstrumentoService;

public class TipoInstrumentoServiceImpl implements ITipoInstrumentoService{

	@Inject
	private ITipoInstrumentoDao tiDao;
	@Override
	public void insert(TipoInstrumento ti) {
		tiDao.insert(ti);
	}

	@Override
	public List<TipoInstrumento> list() {
		// TODO Auto-generated method stub
		return tiDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tiDao.delete(id);
	}

	@Override
	public void update(TipoInstrumento ti) {
		// TODO Auto-generated method stub
		tiDao.update(ti);
	}

	@Override
	public List<TipoInstrumento> findByNameTipoInstrumento(TipoInstrumento ti) {
		// TODO Auto-generated method stub
		return tiDao.findByNameTipoInstrumento(ti);
	}

}
