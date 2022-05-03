package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IInstrumentoDao;
import pe.edu.upc.entities.Instrumento;
import pe.edu.upc.serviceinterfaces.IInstrumentoService;

@Named
public class InstrumentoServiceImpl implements IInstrumentoService {

	@Inject
	private IInstrumentoDao iDao;

	@Override
	public void insert(Instrumento i) {
		iDao.insert(i);
	}

	@Override
	public List<Instrumento> list() {
		return iDao.list();
	}

	@Override
	public void delete(int id) {
		iDao.delete(id);

	}

	@Override
	public void update(Instrumento i) {
		// TODO Auto-generated method stub
		iDao.update(i);
	}

	@Override
	public List<Instrumento> findByNameInstrumento(Instrumento i) {
		// TODO Auto-generated method stub
		return iDao.findByNameInstrumento(i);
	}

}
