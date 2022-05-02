package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IDueñoDao;
import pe.edu.upc.entities.Dueño;

public class DueñoImpl implements IDueñoDao{

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Dueño d) {
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
	public List<Dueño> list() {
		// TODO Auto-generated method stub
		List<Dueño> listadueño = new ArrayList<Dueño>();
		
		try {
			Query jpql = em.createQuery("from Dueño d");
			listadueño = (List<Dueño>) jpql.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar persona en el DAO");
		}
		return listadueño;
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			Dueño dueño = em.find(Dueño.class, id);
			em.remove(dueño);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar en el DAO");
		}
		
	}

	@Transactional
	@Override
	public void update(Dueño du) {
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
	public List<Dueño> findByNameDueño(Dueño d) {
		// TODO Auto-generated method stub
		List<Dueño> lista = new ArrayList<Dueño>();
		
		try {
			Query q=em.createQuery("from Dueño d where d.NNombre like ?1");
			q.setParameter(1, "%"+d.getNNombre()+"%");
			
			lista = (List<Dueño>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar vacunas en el daoimpl");
		}
		return lista;
	}

}
