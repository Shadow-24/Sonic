package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Reserva;

public interface IReservaDao {
	public void insert(Reserva u);

	public List<Reserva> list();

	public void delete(int id);

	public void update(Reserva r);

	public List<Reserva> findbyNameEstudio(Reserva r);
}
