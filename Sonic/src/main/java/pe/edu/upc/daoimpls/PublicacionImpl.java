package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPublicacionDao;
import pe.edu.upc.entities.Publicacion;

public class PublicacionImpl implements IPublicacionDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Publicacion pu) {

		try {
			em.persist(pu);
		} catch (Exception e) {
			System.out.println("Error al insertar publicaciones en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publicacion> list() {
		List<Publicacion> listapublicacion = new ArrayList<Publicacion>();
		try {
			Query jpql = em.createQuery("from Publicacion pu");
			listapublicacion = (List<Publicacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar publicaciones en el DAO");
		}

		return listapublicacion;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Publicacion pub = em.find(Publicacion.class, id);
			em.remove(pub);
		} catch (Exception e) {
			System.out.println("Error al eliminar publicaciones en el DAO");
		}
	}

	@Transactional
	@Override
	public void Update(Publicacion pu) {

		try {
			em.merge(pu);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de publicaciones");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Publicacion> findByNamePublicacion(Publicacion pu) {

		List<Publicacion> lista = new ArrayList<Publicacion>();

		try {
			Query q = em.createQuery("from Publicacion pu where pu.DPublicacion like ?1");
			q.setParameter(1, "%" + pu.getDPublicacion() + "%");
			lista = (List<Publicacion>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar publicaciones en el daoimpl");
		}
		return lista;
	}
}
