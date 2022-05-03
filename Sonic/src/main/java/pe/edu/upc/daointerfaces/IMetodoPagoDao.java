package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.MetodoPago;

public interface IMetodoPagoDao {
	public void insert(IMetodoPagoDao mp);
	
	public List<MetodoPago> list();
	
	public void delete(int id);
	
	public void update(MetodoPago mp);
	
	public List<MetodoPago> findByNameMetodoPago(MetodoPago mp);
	
	
	
}
