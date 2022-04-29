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
		// TODO Auto-generated method stub
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

}
