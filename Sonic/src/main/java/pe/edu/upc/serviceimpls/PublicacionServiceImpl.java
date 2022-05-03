package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPublicacionDao;
import pe.edu.upc.entities.Publicacion;
import pe.edu.upc.serviceinterfaces.IPublicacionService;

@Named
public class PublicacionServiceImpl implements IPublicacionService {

	@Inject
	private IPublicacionDao puDao;

	@Override
	public void insert(Publicacion pu) {

		puDao.insert(pu);
	}

	@Override
	public List<Publicacion> list() {
		return puDao.list();
	}

	@Override
	public void delete(int id) {
		puDao.delete(id);
	}

	@Override
	public void update(Publicacion pu) {
		puDao.Update(pu);

	}

	@Override
	public List<Publicacion> findByNamePublicacion(Publicacion pu) {

		return puDao.findByNamePublicacion(pu);
	}

}
