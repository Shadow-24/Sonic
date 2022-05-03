package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.MetodoPago;

public interface IMetodoPagoService {
	public void insert(MetodoPago mp);
	
	public List<MetodoPago> list();
	
	public void delete(int id);
	
	public void update(MetodoPago mp);
	
	public List<MetodoPago> finByNameMetodoPago(MetodoPago mp);
	
}
