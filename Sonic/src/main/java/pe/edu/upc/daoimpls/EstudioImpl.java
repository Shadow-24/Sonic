package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IEstudioDao;
import pe.edu.upc.entities.Estudio;

public class EstudioImpl implements IEstudioDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Estudio e) {
		try {
			em.persist(e);

		} catch (Exception e2) {
			System.out.println("Error al insertar estudio en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estudio> list() {

		List<Estudio> listaestudio = new ArrayList<Estudio>();
		try {
			Query jpql = em.createQuery("from Estudio e");
			listaestudio = (List<Estudio>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar estudio en el DAO");
		}
		return listaestudio;
	}

	@Transactional
	@Override
	public void delete(int id) {

		try {
			Estudio es = em.find(Estudio.class, id);
			em.remove(es);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estudio> findByNameEstudio(Estudio e) {
		List<Estudio> lista = new ArrayList<Estudio>();
		try {
			Query q = em.createQuery("from Estudio e where e.NEstudio like ?1");
			q.setParameter(1, "%" + e.getNEstudio());
			lista = (List<Estudio>) q.getResultList();
		} catch (Exception e2) {
			System.out.println("Error al buscar Estudios en el daoimpl");
		}
		return lista;
	}
}
