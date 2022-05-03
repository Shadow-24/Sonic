package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IMetodoPagoDao;
import pe.edu.upc.entities.MetodoPago;

public class MetodoPagoImpl implements IMetodoPagoDao{

	@PersistenceContext(unitName="Sonic")
	private EntityManager em;
		
	@Transactional
	@Override
	public void insert(IMetodoPagoDao mp) {
		// TODO Auto-generated method stub
		try {
			em.persist(mp);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar el metodo en el DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MetodoPago> list() {
		// TODO Auto-generated method stub
		List<MetodoPago> listametodopagos = new ArrayList<MetodoPago>();
		
		try {
			Query jpql=em.createQuery("from TipoInstrumento ti");
			listametodopagos = (List<MetodoPago>) jpql.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar metodos de pago");
		}
		return listametodopagos;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			MetodoPago mepa = em.find(MetodoPago.class, id);
			em.remove(mepa);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar metodo de pago");
		}
		
	}

	@Transactional
	@Override
	public void update(MetodoPago mp) {
		try {
			em.merge(mp);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar metodo de pago");
		}
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MetodoPago> findByNameMetodoPago(MetodoPago mp) {
		// TODO Auto-generated method stub
		List<MetodoPago> lista = new ArrayList<MetodoPago>();
		
		try {
			Query q=em.createQuery("from MetodoPago mp where mp.DMetodo like?1");
			q.setParameter(1, "%"+mp.getDMetodo()+"%");
			lista=(List<MetodoPago>) q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar metodos de pago en el dao");
		}

		return lista;
	}
	
	

}
