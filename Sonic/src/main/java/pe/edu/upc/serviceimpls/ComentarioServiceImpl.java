package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.IComentarioDao;
import pe.edu.upc.entities.Comentario;
import pe.edu.upc.serviceinterfaces.IComentarioService;

public class ComentarioServiceImpl implements IComentarioService {

	@Inject
	private IComentarioDao coDao;

	@Override
	public void insert(Comentario co) {

		coDao.insert(co);
	}

	@Override
	public List<Comentario> list() {
		return coDao.list();
	}

	@Override
	public void delete(int id) {
		coDao.delete(id);

	}

	@Override
	public void update(Comentario co) {
		coDao.Update(co);

	}

}
