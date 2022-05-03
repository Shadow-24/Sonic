package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	
	//Metodo para insertar usuario
	public void insert(Usuario u);

	//Metodo para listar usuario	
	public List<Usuario> list();

	//Metodo para borrar usuario
	public void delete(int id);
	
	//Metodo para editar usuario
	public void update(Usuario us);

	//Metodo para buscar usuario. Regresa una lista de usuarios
	public List<Usuario> findByNameUsuario(Usuario u);
}
