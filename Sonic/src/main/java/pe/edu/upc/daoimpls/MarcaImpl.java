package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IMarcaDao;
import pe.edu.upc.entities.Marca;

public class MarcaImpl implements IMarcaDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Marca m) {
		try {
			em.persist(m);
		} catch (Exception e) {
			System.out.println("Error al insertar marcas en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> list() {
		List<Marca> listamarcas = new ArrayList<Marca>();
		try {
			Query jpql = em.createQuery("from Marca m");
			listamarcas = (List<Marca>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar marcas en el DAO");
		}

		return listamarcas;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Marca mar = em.find(Marca.class, id);
			em.remove(mar);
		} catch (Exception e) {
			System.out.println("Error al eliminar marcas en el DAO");
		}
	}

	@Transactional
	@Override
	public void update(Marca m) {
		try {
			em.merge(m);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Marca> findByNameMarca(Marca m) {
		List<Marca> lista = new ArrayList<Marca>();
		try {
			Query q = em.createQuery("from Marca m where m.NMarca like ?1");
			q.setParameter(1, "%" + m.getNMarca() + "%");
			lista = (List<Marca>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar marcas en el daoimpl");
		}
		// TODO Auto-generated method stub
		return lista;
	}

}
