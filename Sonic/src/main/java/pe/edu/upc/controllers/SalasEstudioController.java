package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Estudio;
import pe.edu.upc.entities.SalasEstudio;
import pe.edu.upc.serviceinterfaces.IEstudioService;
import pe.edu.upc.serviceinterfaces.ISalasEstudioService;

@Named
@RequestScoped
public class SalasEstudioController {

	@Inject
	private ISalasEstudioService seService;

	@Inject
	private IEstudioService eService;

	private SalasEstudio se;
	List<SalasEstudio> listaSalasEstudio;

	List<Estudio> listaEstudio;

	@PostConstruct
	public void init() {
		this.se = new SalasEstudio();
		this.listaSalasEstudio = new ArrayList<SalasEstudio>();
		this.listaEstudio = new ArrayList<Estudio>();
		this.se = new SalasEstudio();
		this.list();
		this.listEstudios();
	}

	public void insert() {
		try {
			seService.insert(se);
		} catch (Exception e) {
			System.out.println("Error al insertar salas en el controlador");
		}
	}

	public String newSalaEstdio() {
		this.setSe(new SalasEstudio());
		return "master.xhtml";
	}
	public void list() {
		try {
			listaSalasEstudio = seService.list();
		} catch (Exception e) {
			System.out.println("Error al listar salas en el controlador");
		}
	}

	public void delete(SalasEstudio esc) {
		try {
			seService.delete(esc.getIdSalasEstudio());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar Salas en el controlador de sala");
		}
	}
	
	public void listEstudios() {
		try {
			listaEstudio = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Estudios en el controlador de salas");
		}
	}

	 public void findByNameSalasEstudio() {
		try {
			listaSalasEstudio=seService.findByNameSalasEstudio(this.getSe());
		} catch (Exception e) {
			System.out.println("Error al buscar Salas en el controlador");
		}
	}
	
	// Getters & Setters
	public SalasEstudio getSe() {
		return se;
	}

	public void setSe(SalasEstudio se) {
		this.se = se;
	}

	public List<SalasEstudio> getListaSalasEstudio() {
		return listaSalasEstudio;
	}

	public void setListaSalasEstudio(List<SalasEstudio> listaSalasEstudio) {
		this.listaSalasEstudio = listaSalasEstudio;
	}

	public List<Estudio> getListaEstudio() {
		return listaEstudio;
	}

	public void setListaEstudio(List<Estudio> listaEstudio) {
		this.listaEstudio = listaEstudio;
	}

}
