package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;

public class CalificacionImpl implements ICalificacionDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Calificacion ca) {
		try {
			em.persist(ca);
		} catch (Exception ca2) {
			System.out.println("Error al insertar Calificacion en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> list() {
		List<Calificacion> listacalificacion = new ArrayList<Calificacion>();
		try {
			Query jpql = em.createQuery("from Calificacion ca");
			listacalificacion = (List<Calificacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Calificacion en el DAO");
		}
		return listacalificacion;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> findByNameCalificacion(Calificacion ca) {
		List<Calificacion> lista = new ArrayList<Calificacion>();
		try {
			Query q = em.createQuery("from Calificacion ca where ca.QEstrellas like ?1");
			q.setParameter(1, "%" + ca.getQEstrellas() + "%");
			lista = (List<Calificacion>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar calificacion en el daoimpl");
		}
		return lista;
	}

}
