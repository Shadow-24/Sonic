package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.IMarcaDao;
import pe.edu.upc.entities.Marca;
import pe.edu.upc.serviceinterfaces.IMarcaService;

public class MarcaServiceImpl implements IMarcaService {

	@Inject
	private IMarcaDao mDao;

	@Override
	public void insert(Marca m) {
		mDao.insert(m);
	}

	@Override
	public List<Marca> list() {
		// TODO Auto-generated method stub
		return mDao.list();
	}

	@Override
	public void delete(int id) {
		mDao.delete(id);
	}

	@Override
	public void update(Marca m) {
		mDao.update(m);
	}

	@Override
	public List<Marca> findByNameMarca(Marca m) {
		// TODO Auto-generated method stub
		return mDao.findByNameMarca(m);
	}

}
