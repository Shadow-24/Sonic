package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ISalasEstudioDao;
import pe.edu.upc.entities.SalasEstudio;

public class SalasEstudioImpl implements ISalasEstudioDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(SalasEstudio se) {
		try {
			em.persist(se);
		} catch (Exception e) {
			System.out.println("Error al insertar en el dao de Salas");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SalasEstudio> list() {

		List<SalasEstudio> listaSalasEstudio = new ArrayList<SalasEstudio>();

		try {
			Query jpql = em.createQuery("from SalasEstudio se");
			listaSalasEstudio = (List<SalasEstudio>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar el dao de Salas");
		}
		return listaSalasEstudio;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			SalasEstudio ses = em.find(SalasEstudio.class, id);
			em.remove(ses);
		} catch (Exception e) {
			System.out.println("Error al eliminar salas en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SalasEstudio> findByNameSalasEstudio(SalasEstudio fi) {
		List<SalasEstudio> lista=new ArrayList<SalasEstudio>();
		try {
			Query q=em.createQuery("from SalasEstudio fi where fi.NSalasEstudio like ?1");
			q.setParameter(1, "%" + fi.getNSalasEstudio()+"%");
			lista = (List<SalasEstudio>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar Salas en el daoimpl");
		}
		return lista;
	}

}