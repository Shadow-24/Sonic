package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Dueño;

public interface IDueñoDao {
	
	//Metodo para insertar usuario
	public void insert(Dueño d);

	//Metodo para listar usuario	
	public List<Dueño> list();

	//Metodo para borrar usuario
	public void delete(int id);
	
	//Metodo para editar usuario
	public void update(Dueño du);

	//Metodo para buscar usuario. Regresa una lista de usuarios
	public List<Dueño> findByNameDueño(Dueño d);
}
