package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Due�o;

public interface IDue�oDao {
	
	//Metodo para insertar usuario
	public void insert(Due�o d);

	//Metodo para listar usuario	
	public List<Due�o> list();

	//Metodo para borrar usuario
	public void delete(int id);
	
	//Metodo para editar usuario
	public void update(Due�o du);

	//Metodo para buscar usuario. Regresa una lista de usuarios
	public List<Due�o> findByNameDue�o(Due�o d);
}
