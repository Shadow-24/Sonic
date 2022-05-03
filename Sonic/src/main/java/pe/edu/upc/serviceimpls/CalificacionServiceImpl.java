package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.serviceinterfaces.ICalificacionService;

@Named
public class CalificacionServiceImpl implements ICalificacionService{

	@Inject
	private ICalificacionDao calDao;
	
	@Override
	public void insert(Calificacion cal) {
		// TODO Auto-generated method stub
		calDao.insert(cal);
	}

	@Override
	public List<Calificacion> list() {
		// TODO Auto-generated method stub
		return calDao.list();
	}

	@Override
	public List<Calificacion> findByNameCalificacion(Calificacion cal) {
		// TODO Auto-generated method stub
		return calDao.findByNameCalificacion(cal);
	}

}
