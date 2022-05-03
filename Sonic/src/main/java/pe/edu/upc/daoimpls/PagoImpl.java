package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IPagoDao;
import pe.edu.upc.entities.Pago;

public class PagoImpl implements IPagoDao{

	
	@PersistenceContext(unitName = "Sonic")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Pago p) {
		// TODO Auto-generated method stub
		try {
			em.persist(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar reservas en el DAO");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Pago> list() {
		// TODO Auto-generated method stub
		List<Pago> listapago = new ArrayList<Pago>();
		try {
			Query jpql=em.createQuery("from Pago p");
			listapago = (List<Pago>) jpql.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar pagos en el DAO");
		}
		
		return listapago;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			Pago pag = em.find(Pago.class, id);
			em.remove(pag);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar reservas en el DAO");
		}
	}

}
