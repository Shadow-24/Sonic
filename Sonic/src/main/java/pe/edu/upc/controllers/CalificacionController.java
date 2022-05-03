package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Estudio;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.ICalificacionService;
import pe.edu.upc.serviceinterfaces.IEstudioService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class CalificacionController {

	@Inject
	private ICalificacionService calService;

	@Inject
	private IEstudioService esService;

	@Inject
	private IUsuarioService usService;

	private Calificacion cal;
	private List<Calificacion> listacalificacion;

	List<Estudio> listaestudios;
	List<Usuario> listausuarios;

	@PostConstruct
	public void init() {
		this.listacalificacion = new ArrayList<Calificacion>();
		this.cal = new Calificacion();
		this.list();
		this.listEstudios();
		this.listUsuarios();
	}

	public void insert() {
		try {
			calService.insert(cal);
		} catch (Exception e) {
			System.out.println("Error al insertar Calificacion en el controller" + e.getStackTrace());
		}
	}

	public void list() {
		try {
			listacalificacion = calService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Calificacion en el controller" + e.getStackTrace());
		}
	}

	public void listEstudios() {
		try {
			listaestudios = esService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Estudios en el controlador de salas");
		}
	}

	public void listUsuarios() {
		try {
			listausuarios = usService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Usuarios en el controlador de salas");
		}
	}
	
	public void findByNameCalificacion() {
		try {
			listacalificacion = calService.findByNameCalificacion(this.getCal());
		} catch (Exception e) {
			System.out.println("Error al buscar Calificacion en el controlador");
		}
	}
	
	// Getters and Setters
	public Calificacion getCal() {
		return cal;
	}

	public void setCal(Calificacion cal) {
		this.cal = cal;
	}

	public List<Calificacion> getListacalificacion() {
		return listacalificacion;
	}

	public void setListacalificacion(List<Calificacion> listacalificacion) {
		this.listacalificacion = listacalificacion;
	}

	public List<Estudio> getListaestudios() {
		return listaestudios;
	}

	public void setListaestudios(List<Estudio> listaestudios) {
		this.listaestudios = listaestudios;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

}
