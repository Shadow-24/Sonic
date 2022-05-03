package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IReservaDao;
import pe.edu.upc.entities.Reserva;

public class ReservaImpl implements IReservaDao {

	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Reserva r) {
		try {
			em.persist(r);
		} catch (Exception e) {
			System.out.println("Error al insertar reservas en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> list() {
		List<Reserva> listareserva = new ArrayList<Reserva>();
		try {
			Query jpql = em.createQuery("from Reserva r");
			listareserva = (List<Reserva>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar reservas en el DAOimpl");
		}

		return listareserva;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Reserva res = em.find(Reserva.class, id);
			em.remove(res);
		} catch (Exception e) {
			System.out.println("Error al eliminar reservas en el DAOimpl");
		}

	}

	@Transactional
	@Override
	public void update(Reserva r) {

		try {
			em.merge(r);
		} catch (Exception e) {
			System.out.println("Error al modificar en el daoimpl de reservas");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> findbyNameEstudio(Reserva r) {

		List<Reserva> lista = new ArrayList<Reserva>();

		try {
			Query q = em.createQuery("from Reserva pu where pu.CEstudio like ?1");
			q.setParameter(1, "%" + r.getCEstudio() + "%");
			lista = (List<Reserva>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar reservas en el daoimpl");
		}
		return lista;
	}

}
