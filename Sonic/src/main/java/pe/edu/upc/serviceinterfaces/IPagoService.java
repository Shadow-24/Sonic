package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Pago;

public interface IPagoService {
	
	public void insert(Pago p);
	
	public List<Pago> list();
	
	public void delete(int id);
}
