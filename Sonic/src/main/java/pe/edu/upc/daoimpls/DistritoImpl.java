package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDistritoDao;
import pe.edu.upc.entities.Distrito;

public class DistritoImpl implements IDistritoDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Distrito d) {

		try {
			em.persist(d);
		} catch (Exception e) {
			System.out.println("Error al insertar Distrito en Dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> list() {
		List<Distrito> listaDistritos = new ArrayList<Distrito>();
		try {
			Query jpql = em.createQuery("from Distrito d");
			listaDistritos = (List<Distrito>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Distrito en Dao");
		}
		return listaDistritos;
	}

}
