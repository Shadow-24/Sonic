package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Comentario;

public interface IComentarioService {

	public void insert(Comentario co);

	public List<Comentario> list();

	public void delete(int id);

	public void update(Comentario co);

}
