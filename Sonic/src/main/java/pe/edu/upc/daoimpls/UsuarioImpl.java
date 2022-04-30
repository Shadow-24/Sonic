package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioImpl implements IUsuarioDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Usuario u) {

		try {
			em.persist(u);
		} catch (Exception e) {
			System.out.println("Error al insertar persona en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {

		List<Usuario> listausuario = new ArrayList<Usuario>();
		try {
			Query jpql = em.createQuery("from Usuario u");
			listausuario = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar persona en el DAO");
		}

		return listausuario;
	}

	@Transactional
	@Override
	public void delete(int id) {

		try {
			Usuario user = em.find(Usuario.class, id);
			em.remove(user);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}
	}

	@Transactional
	@Override
	public void update(Usuario us) {
		// TODO Auto-generated method stub
		try {
			em.merge(us);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar");
		}
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findByNameUsuario(Usuario u) {
		
		List<Usuario> lista=new ArrayList<Usuario>();
		try {
			//Este query nos permite ver a las persnoas que coincidan con el nombre de usuario
			Query q=em.createQuery("from Usuario u where u.NNombre like ?1");
			q.setParameter(1, "%"+u.getNNombre()+"%");
			
			//La lista se llena con los resultados de la ejecucion del query
			lista = (List<Usuario>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar vacunas en el daoimpl");
		}
		// TODO Auto-generated method stub
		return lista;
	}
}
