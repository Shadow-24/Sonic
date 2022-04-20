package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Estudio;
import pe.edu.upc.serviceinterfaces.IEstudioService;

@Named
@RequestScoped
public class EstudioController {
	@Inject
	private IEstudioService eService;

	// atributos
	private Estudio e;
	private List<Estudio> listaestudio;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaestudio = new ArrayList<Estudio>();
		this.e = new Estudio();
		this.list();
	}

	// Métodos para atender peticiones

	public String newEstudio() {
		this.setE(new Estudio());
		return "master.xhtml";
	}

	public void insert() {
		try {
			eService.insert(e);
		} catch (Exception e) {
			System.out.println("Error al insertar escenario en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listaestudio = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar escenario en el controller" + e.getStackTrace());
		}
	}

	public void delete(Estudio esc) {
		try {
			eService.delete(esc.getCEstudio());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar escenario en el controlador de usuario");
		}

	}

	// getters & setters
	public Estudio getE() {
		return e;
	}

	public void setE(Estudio e) {
		this.e = e;
	}

	public List<Estudio> getListaestudio() {
		return listaestudio;
	}

	public void setListaestudio(List<Estudio> listaestudio) {
		this.listaestudio = listaestudio;
	}

}
