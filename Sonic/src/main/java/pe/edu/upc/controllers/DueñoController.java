package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Dueño;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IDueñoService;

@Named
public class DueñoController {

	@Inject
	private IDueñoService dService;

	private Dueño d;
	private List<Dueño> listadueños;

	public void init() {
		this.listadueños = new ArrayList<Dueño>();
		this.d = new Dueño();
		this.list();

	}

	public String newDueño() {
		this.setD(new Dueño());
		return "master.xhtml";

	}

	public void insert() {
		try {
			dService.insert(d);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eror al insertar en el controller"+e.getStackTrace());
		} 
	}
	
	public void list() {
		try {
			listadueños = dService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar en el controller" + e.getStackTrace());
		}
	}

	// BUSCAR
	public void findByNameDueño() {
		try {
			// Llena una nueva lista con los usuarios del metodo
			listadueños = dService.findByNameDueño(this.getD());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar dueño en el controlador");
		}
	}

	public void delete(Usuario us) {
		try {
			dService.delete(d.getCDueño());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de usuario");
		}
	}
	
	
	public Dueño getD() {
		return d;
	}

	public void setD(Dueño d) {
		this.d = d;
	}

	public List<Dueño> getListadueños(){
		return listadueños;
	}
	
	public String preUpdate(Dueño du) {
		this.setD(du);
		return "modificacion.xhtml";
	}
	
	public void update() {
		try {
			dService.update(this.d);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar dueño en el controlador");
		}
	}
	
	public void setListadueños(List<Dueño> listadueños) {
		this.listadueños = listadueños;
	}
}
