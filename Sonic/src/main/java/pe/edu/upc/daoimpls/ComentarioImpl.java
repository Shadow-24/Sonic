package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IComentarioDao;
import pe.edu.upc.entities.Comentario;

public class ComentarioImpl implements IComentarioDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Comentario co) {

		try {
			em.persist(co);
		} catch (Exception e) {
			System.out.println("Error al insertar comentarios en el DAO");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> list() {
		List<Comentario> listacomentarios = new ArrayList<Comentario>();
		try {
			Query jpql = em.createQuery("from Comentario co");
			listacomentarios = (List<Comentario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar comentarios en el DAO");
		}

		return listacomentarios;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Comentario co = em.find(Comentario.class, id);
			em.remove(co);
		} catch (Exception e) {
			System.out.println("Error al eliminar comentario en el DAO");
		}
	}

	@Transactional
	@Override
	public void Update(Comentario co) {

		try {
			em.merge(co);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de publicaciones");
		}
	}

}
