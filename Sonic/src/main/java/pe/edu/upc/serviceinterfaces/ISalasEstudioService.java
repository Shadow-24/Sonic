package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.SalasEstudio;

public interface ISalasEstudioService {

	public void insert(SalasEstudio se);

	public List<SalasEstudio> list();
}
