package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IReservaDao;
import pe.edu.upc.entities.Reserva;
import pe.edu.upc.serviceinterfaces.IReservaService;

@Named
public class ReservaServiceImpl implements IReservaService {
	@Inject
	private IReservaDao rDao;

	@Override
	public void insert(Reserva r) {
		rDao.insert(r);

	}

	@Override
	public List<Reserva> list() {
		return rDao.list();
	}

	@Override
	public void delete(int id) {
		rDao.delete(id);

	}

}
