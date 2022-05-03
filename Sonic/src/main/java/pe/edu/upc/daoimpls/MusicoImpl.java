package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IMusicoDao;
import pe.edu.upc.entities.Musico;

public class MusicoImpl implements IMusicoDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Musico m) {

		try {
			em.persist(m);
		} catch (Exception e) {
			System.out.println("Error al insertar musico en el DAOimpl");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Musico> list() {

		List<Musico> listamusico = new ArrayList<Musico>();
		try {
			Query jpql = em.createQuery("from Musico m");
			listamusico = (List<Musico>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar musicos en el DAO");
		}

		return listamusico;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Musico mu = em.find(Musico.class, id);
			em.remove(mu);
		} catch (Exception e) {
			System.out.println("Error al eliminar musicos en el DAO");
		}
	}

	@Transactional
	@Override
	public void update(Musico m) {

		try {
			em.merge(m);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de musico");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Musico> findByNameCodigo(Musico m) {
		List<Musico> lista = new ArrayList<Musico>();

		try {
			Query q = em.createQuery("from Musico m where m.DMusico like ?1");
			q.setParameter(1, "%" + m.getDMusico() + "%");
			lista = (List<Musico>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar musico en el daoimpl");
		}

		return lista;
	}
}
