package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDistritoDao;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.serviceinterfaces.IDistritoService;

@Named

public class DistritoServiceImpl implements IDistritoService {

	@Inject
	private IDistritoDao dDao;
	
	@Override
	public void insert(Distrito d) {
		dDao.insert(d);
	}

	@Override
	public List<Distrito> list() {
		
		return dDao.list();
	}
	
}
