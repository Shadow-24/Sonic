package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IPagoDao;
import pe.edu.upc.entities.Pago;
import pe.edu.upc.serviceinterfaces.IPagoService;

@Named
public class PagoServiceImpl implements IPagoService {

	@Inject
	private IPagoDao pDao;

	@Override
	public void insert(Pago p) {
		// TODO Auto-generated method stub
		pDao.insert(p);
	}

	@Override
	public List<Pago> list() {
		// TODO Auto-generated method stub
		return pDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pDao.delete(id);

	}

}
