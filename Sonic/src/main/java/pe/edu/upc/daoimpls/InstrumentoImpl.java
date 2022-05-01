package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IInstrumentoDao;
import pe.edu.upc.entities.Instrumento;

public class InstrumentoImpl implements IInstrumentoDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Instrumento i) {

		try {
			em.persist(i);
		} catch (Exception e) {
			System.out.println("Error al insertar instrumentos en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Instrumento> list() {
		List<Instrumento> listainstrumentos = new ArrayList<Instrumento>();
		try {
			Query jpql = em.createQuery("from Instrumento i");
			listainstrumentos = (List<Instrumento>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar instrumentos en el DAO");
		}

		return listainstrumentos;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Instrumento ins = em.find(Instrumento.class, id);
			em.remove(ins);
		} catch (Exception e) {
			System.out.println("Error al eliminar instrumentos en el DAO");
		}
	}

	@Transactional
	@Override
	public void update(Instrumento i) {
		// TODO Auto-generated method stub
		try {
			em.merge(i);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Instrumento> findByNameInstrumento(Instrumento i) {
		// TODO Auto-generated method stub
		List<Instrumento> lista = new ArrayList<Instrumento>();
		try {
			Query q = em.createQuery("from Instrumento i where i.NInstrumento like ?1");
			q.setParameter(1, "%" + i.getNInstrumento() + "%");
			lista = (List<Instrumento>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar instrumentos en el daoimpl");
		}
		// TODO Auto-generated method stub
		return lista;
	}

}
