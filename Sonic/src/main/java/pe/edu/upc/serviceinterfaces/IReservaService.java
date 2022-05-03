package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Reserva;

public interface IReservaService {

	public void insert(Reserva r);

	public List<Reserva> list();

	public void delete(int id);

	public void Update(Reserva r);

	public List<Reserva> findByNameEscenario(Reserva r);
}
