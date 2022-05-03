package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.ISalasEstudioDao;
import pe.edu.upc.entities.SalasEstudio;
import pe.edu.upc.serviceinterfaces.ISalasEstudioService;

@Named
public class SalasEstudioServiceImpl implements ISalasEstudioService {

	@Inject
	private ISalasEstudioDao seDao;
	
	@Override
	public void insert(SalasEstudio se) {
		// TODO Auto-generated method stub
		seDao.insert(se);
	}

	@Override
	public List<SalasEstudio> list() {
		// TODO Auto-generated method stub
		return seDao.list();
	}

}
