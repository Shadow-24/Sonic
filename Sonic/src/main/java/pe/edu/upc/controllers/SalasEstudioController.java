package pe.edu.upc.controllers;

import java.util.List;

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
	
	
	
	
	
	//Getters & Setters
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
