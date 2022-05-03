package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.IMusicoDao;
import pe.edu.upc.entities.Musico;
import pe.edu.upc.serviceinterfaces.IMusicoService;

public class MusicoServiceImpl implements IMusicoService {

	@Inject
	public IMusicoDao mDao;

	@Override
	public void insert(Musico m) {
		mDao.insert(m);
	}

	@Override
	public List<Musico> list() {
		return mDao.list();
	}

	@Override
	public void delete(int id) {

		mDao.delete(id);
	}

	@Override
	public void update(Musico m) {
		mDao.update(m);

	}

	@Override
	public List<Musico> findByNamePublicacion(Musico m) {
		return mDao.findByNameCodigo(m);
	}

}
