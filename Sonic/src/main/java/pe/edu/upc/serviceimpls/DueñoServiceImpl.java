package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDueñoDao;
import pe.edu.upc.entities.Dueño;
import pe.edu.upc.serviceinterfaces.IDueñoService;

@Named
public class DueñoServiceImpl implements IDueñoService{
	
	@Inject
	private IDueñoDao dDao;

	@Override
	public void insert(Dueño d) {
		// TODO Auto-generated method stub
		dDao.insert(d);
	}

	@Override
	public List<Dueño> list() {
		// TODO Auto-generated method stub
		return dDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dDao.delete(id);
	}

	@Override
	public void update(Dueño du) {
		// TODO Auto-generated method stub
		dDao.update(du);
	}

	@Override
	public List<Dueño> findByNameDueño(Dueño d) {
		// TODO Auto-generated method stub
		return dDao.findByNameDueño(d);
	}
		
	
	
}
