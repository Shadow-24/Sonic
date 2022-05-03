package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Pago;

public interface IPagoDao {
	
	public void insert(Pago p);
	
	public List<Pago> list();
	
	public void delete(int id);

}
