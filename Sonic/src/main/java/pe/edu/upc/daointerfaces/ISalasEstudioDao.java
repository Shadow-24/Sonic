package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.SalasEstudio;

public interface ISalasEstudioDao {
	
	public void insert(SalasEstudio se);

	public List<SalasEstudio> list();
}
