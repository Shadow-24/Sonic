package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.entities.Due?o;
import pe.edu.upc.entities.Estudio;
import pe.edu.upc.serviceinterfaces.IDistritoService;
import pe.edu.upc.serviceinterfaces.IDue?oService;
import pe.edu.upc.serviceinterfaces.IEstudioService;

@Named
@RequestScoped
public class EstudioController {

	@Inject
	private IEstudioService eService;

	@Inject
	private IDistritoService dService;

	@Inject
	private IDue?oService duService;
	// atributos
	private Estudio e;
	private List<Estudio> listaestudio;

	List<Distrito> listaDistrito;
	List<Due?o> listaDueno;

	// inicializar
	@PostConstruct
	public void init() {
		this.listaestudio = new ArrayList<Estudio>();
		this.e = new Estudio();
		this.list();
		this.listDistritos();
		this.listDueno();
	}

	// M?todos para atender peticiones

	public String newEstudio() {
		this.setE(new Estudio());
		return "master.xhtml";
	}

	public void insert() {
		try {
			eService.insert(e);
		} catch (Exception e) {
			System.out.println("Error al insertar estudio en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listaestudio = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar estudio en el controller" + e.getStackTrace());
		}
	}

	public void delete(Estudio esc) {
		try {
			eService.delete(esc.getCEstudio());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar estudio en el controlador de Estudio");
		}

	}
	
	public void listDistritos() {
		try {
			listaDistrito = dService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Distritos en el controlador de estudio");
		}
	}
	
	public void listDueno() {
		try {
			listaDueno = duService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Usuarios en el controlador de estudio");
		}
	}
	
	public void findByNameEstudio() {
		try {
			listaestudio = eService.findByNameEstudio(this.getE());
		} catch (Exception e) {
			System.out.println("Error al buscar Estudio en el controlador");
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

	public List<Distrito> getListaDistrito() {
		return listaDistrito;
	}

	public void setListaDistrito(List<Distrito> listaDistrito) {
		this.listaDistrito = listaDistrito;
	}

	public List<Due?o> getListaDueno() {
		return listaDueno;
	}

	public void setListaDueno(List<Due?o> listaDueno) {
		this.listaDueno = listaDueno;
	}

	

}
