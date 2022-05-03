package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioService {

	public void insert(Usuario u);

	public List<Usuario> list();

	public void delete(int id);
	
	public void update(Usuario us);
	
	public List<Usuario> findByNameUsuario(Usuario u);
	
}
