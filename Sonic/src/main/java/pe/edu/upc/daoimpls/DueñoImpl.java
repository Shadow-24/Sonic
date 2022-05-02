package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDue�oDao;
import pe.edu.upc.entities.Due�o;

public class Due�oImpl implements IDue�oDao{

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Due�o d) {
		// TODO Auto-generated method stub
		try {
			em.persist(d);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar persona en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Due�o> list() {
		// TODO Auto-generated method stub
		List<Due�o> listadue�o = new ArrayList<Due�o>();
		
		try {
			Query jpql = em.createQuery("from Due�o d");
			listadue�o = (List<Due�o>) jpql.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar persona en el DAO");
		}
		return listadue�o;
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			Due�o due�o = em.find(Due�o.class, id);
			em.remove(due�o);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar en el DAO");
		}
		
	}

	@Transactional
	@Override
	public void update(Due�o du) {
		// TODO Auto-generated method stub
		try {
			em.merge(du);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Due�o> findByNameDue�o(Due�o d) {
		// TODO Auto-generated method stub
		List<Due�o> lista = new ArrayList<Due�o>();
		
		try {
			Query q=em.createQuery("from Due�o d where d.NNombre like ?1");
			q.setParameter(1, "%"+d.getNNombre()+"%");
			
			lista = (List<Due�o>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar vacunas en el daoimpl");
		}
		return lista;
	}

}
