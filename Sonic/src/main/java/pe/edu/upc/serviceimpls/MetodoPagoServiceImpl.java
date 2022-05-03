package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.IMetodoPagoDao;
import pe.edu.upc.entities.MetodoPago;
import pe.edu.upc.serviceinterfaces.IMetodoPagoService;

public class MetodoPagoServiceImpl implements IMetodoPagoService{

	@Inject
	private IMetodoPagoDao mpDao;
	
	@Override
	public void insert(MetodoPago mp) {
		// TODO Auto-generated method stub
		mpDao.insert(mpDao);
	}

	@Override
	public List<MetodoPago> list() {
		// TODO Auto-generated method stub
		return mpDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		mpDao.delete(id);
	}

	@Override
	public void update(MetodoPago mp) {
		// TODO Auto-generated method stub
		mpDao.update(mp);
	}

	@Override
	public List<MetodoPago> finByNameMetodoPago(MetodoPago mp) {
		// TODO Auto-generated method stub
		return mpDao.findByNameMetodoPago(mp);
	}

}
