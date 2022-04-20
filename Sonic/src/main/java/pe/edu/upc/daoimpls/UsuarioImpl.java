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
}
