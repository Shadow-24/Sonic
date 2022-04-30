package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
public class UsuarioServiceImpl implements IUsuarioService {
	@Inject
	private IUsuarioDao uDao;

	@Override
	public void insert(Usuario u) {

		uDao.insert(u);
	}

	@Override
	public List<Usuario> list() {

		return uDao.list();
	}

	@Override
	public void delete(int id) {

		uDao.delete(id);

	}

	@Override
	public void update(Usuario us) {
		// TODO Auto-generated method stub
		uDao.update(us);
	}

	@Override
	public List<Usuario> findByNameUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return uDao.findByNameUsuario(u);
	}

}
