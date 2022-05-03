package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.ITipoInstrumentoDao;
import pe.edu.upc.entities.TipoInstrumento;

public class TipoInstrumentoImpl implements ITipoInstrumentoDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(TipoInstrumento ti) {
		// TODO Auto-generated method stub
		try {
			em.persist(ti);
		} catch (Exception e) {
			System.out.println("Error al insertar tipoinstrumentos en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoInstrumento> list() {
		List<TipoInstrumento> listatipoinstrumentos = new ArrayList<TipoInstrumento>();
		try {
			Query jpql = em.createQuery("from TipoInstrumento ti");
			listatipoinstrumentos = (List<TipoInstrumento>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar tipoinstrumentos en el DAO");
		}

		return listatipoinstrumentos;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			TipoInstrumento tins = em.find(TipoInstrumento.class, id);
			em.remove(tins);
		} catch (Exception e) {
			System.out.println("Error al eliminar tipoinstrumentos en el DAO");
		}
	}

	@Transactional
	@Override
	public void update(TipoInstrumento ti) {
		try {
			em.merge(ti);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoInstrumento> findByNameTipoInstrumento(TipoInstrumento ti) {
		List<TipoInstrumento> lista = new ArrayList<TipoInstrumento>();
		try {
			Query q=em.createQuery("from TipoInstrumento ti where ti.NTipoInstrumento like ?1");
			q.setParameter(1, "%" + ti.getNTipoInstrumento() + "%");
			lista = (List<TipoInstrumento>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar marcas en el daoimpl");
		}
		// TODO Auto-generated method stub
		return lista;
	}

}
