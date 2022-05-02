package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Due�o;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IDue�oService;

@Named
public class Due�oController {

	@Inject
	private IDue�oService dService;

	private Due�o d;
	private List<Due�o> listadue�os;

	public void init() {
		this.listadue�os = new ArrayList<Due�o>();
		this.d = new Due�o();
		this.list();

	}

	public String newDue�o() {
		this.setD(new Due�o());
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
			listadue�os = dService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar en el controller" + e.getStackTrace());
		}
	}

	// BUSCAR
	public void findByNameDue�o() {
		try {
			// Llena una nueva lista con los usuarios del metodo
			listadue�os = dService.findByNameDue�o(this.getD());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar due�o en el controlador");
		}
	}

	public void delete(Usuario us) {
		try {
			dService.delete(d.getCDue�o());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de usuario");
		}
	}
	
	
	public Due�o getD() {
		return d;
	}

	public void setD(Due�o d) {
		this.d = d;
	}

	public List<Due�o> getListadue�os(){
		return listadue�os;
	}
	
	public String preUpdate(Due�o du) {
		this.setD(du);
		return "modificacion.xhtml";
	}
	
	public void update() {
		try {
			dService.update(this.d);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar due�o en el controlador");
		}
	}
	
	public void setListadue�os(List<Due�o> listadue�os) {
		this.listadue�os = listadue�os;
	}
}
