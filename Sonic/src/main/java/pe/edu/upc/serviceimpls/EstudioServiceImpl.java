package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IEstudioDao;
import pe.edu.upc.entities.Estudio;
import pe.edu.upc.serviceinterfaces.IEstudioService;

@Named
public class EstudioServiceImpl implements IEstudioService {

	@Inject
	private IEstudioDao eDao;

	@Override
	public void insert(Estudio es) {
		eDao.insert(es);

	}

	@Override
	public List<Estudio> list() {
		return eDao.list();
	}

	@Override
	public void delete(int id) {

		eDao.delete(id);

	}

}
