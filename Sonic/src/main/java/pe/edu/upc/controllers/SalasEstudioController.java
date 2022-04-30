package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Estudio;
import pe.edu.upc.entities.SalasEstudio;
import pe.edu.upc.serviceinterfaces.ISalasEstudioService;

@Named
@RequestScoped
public class SalasEstudioController {

	@Inject
	private ISalasEstudioService seService;

	private SalasEstudio se;
	List<SalasEstudio> listaSalasEstudio;

	List<Estudio> listaEstudio;

	@PostConstruct
	public void init() {
		this.se = new SalasEstudio();
		this.listaSalasEstudio = new ArrayList<SalasEstudio>();
		this.listaEstudio = new ArrayList<Estudio>();
	}

	public void insert() {
		try {
			seService.insert(se);
		} catch (Exception e) {
			System.out.println("Error al insertar salas en el controlador");
		}
	}

	public void list() {
		try {
			listaSalasEstudio = seService.list();
		} catch (Exception e) {
			System.out.println("Error al listar salas en el controlador");
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
