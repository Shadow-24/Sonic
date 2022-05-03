package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Comentario;

public interface IComentarioDao {

	public void insert(Comentario co);

	public List<Comentario> list();

	void delete(int id);

	public void Update(Comentario co);

}
