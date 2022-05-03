package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.serviceinterfaces.IDistritoService;

@Named
@RequestScoped
public class DistritoController {

	@Inject
	private IDistritoService dService;

	private Distrito d;
	List<Distrito> listaDistrito;

	@PostConstruct
	public void init() {
		this.listaDistrito = new ArrayList<Distrito>();
		this.d = new Distrito();
		this.list();
	}

	public void insert() {
		try {
			dService.insert(d);
		} catch (Exception e) {
			System.out.println("Error al insertar en controller Distrito");
		}
	}

	private void list() {
		try {
			listaDistrito=dService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller Distrito");
		}

	}

	// Getters and Setters
	public Distrito getD() {
		return d;
	}

	public void setD(Distrito d) {
		this.d = d;
	}

	public List<Distrito> getListaDistrito() {
		return listaDistrito;
	}

	public void setListaDistrito(List<Distrito> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}

}
