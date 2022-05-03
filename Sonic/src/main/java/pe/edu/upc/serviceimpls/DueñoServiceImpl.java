package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IDue�oDao;
import pe.edu.upc.entities.Due�o;
import pe.edu.upc.serviceinterfaces.IDue�oService;

@Named
public class Due�oServiceImpl implements IDue�oService{
	
	@Inject
	private IDue�oDao dDao;

	@Override
	public void insert(Due�o d) {
		// TODO Auto-generated method stub
		dDao.insert(d);
	}

	@Override
	public List<Due�o> list() {
		// TODO Auto-generated method stub
		return dDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		dDao.delete(id);
	}

	@Override
	public void update(Due�o du) {
		// TODO Auto-generated method stub
		dDao.update(du);
	}

	@Override
	public List<Due�o> findByNameDue�o(Due�o d) {
		// TODO Auto-generated method stub
		return dDao.findByNameDue�o(d);
	}
		
	
	
}
