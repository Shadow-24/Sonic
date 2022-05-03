package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Instrumento;
import pe.edu.upc.entities.Publicacion;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IInstrumentoService;
import pe.edu.upc.serviceinterfaces.IPublicacionService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class PublicacionController {

	@Inject
	private IPublicacionService puService;

	@Inject
	private IUsuarioService uService;

	@Inject
	private IInstrumentoService iService;

	@Inject
	private Publicacion pu;

	List<Publicacion> listapublicaciones;
	List<Usuario> listausuarios;
	List<Instrumento> listainstrumento;

	@PostConstruct
	public void init() {
		this.pu = new Publicacion();
		this.listapublicaciones = new ArrayList<Publicacion>();
		this.listausuarios = new ArrayList<Usuario>();
		this.listainstrumento = new ArrayList<Instrumento>();
		this.list();
		this.listUsuarios();
		this.listInstrumentos();
	}

	// metodos

	public void insert() {

		try {
			puService.insert(pu);
		} catch (Exception e) {
			System.out.println("Error al insertar publicaciones en el controlador");
		}
	}

	public void list() {
		try {
			listapublicaciones = puService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void listUsuarios() {

		try {
			listausuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de publicacion");
		}
	}

	public void listInstrumentos() {
		try {
			listainstrumento = iService.list();
		} catch (Exception e) {
			System.out.println("Error al listar instrumentos en el controlador de publicacion");
		}

	}

	public void delete(Publicacion pu) {
		try {
			puService.delete(pu.getCPublicacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar publicacion en el controlador de publicacion");
		}
	}

	// modificar

	public String preUpdate(Publicacion pu) {

		this.setPu(pu);
		return "modificacion_publicacion.xhtml";
	}

	public void Update() {

		try {
			puService.update(this.pu);
			this.list();
		} catch (Exception e) {
			System.out.println("Error al modificar publicación en el controlador");
		}
	}

	// buscar

	public void findByNamePublicacion() {

		try {
			listapublicaciones = puService.findByNamePublicacion(this.getPu());
		} catch (Exception e) {
			System.out.println("Error al buscar la publicacion en el controlador");
		}
	}

	// getters & setters
	public Publicacion getPu() {
		return pu;
	}

	public void setPu(Publicacion pu) {
		this.pu = pu;
	}

	public List<Publicacion> getListapublicaciones() {
		return listapublicaciones;
	}

	public void setListapublicaciones(List<Publicacion> listapublicaciones) {
		this.listapublicaciones = listapublicaciones;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

	public List<Instrumento> getListainstrumento() {
		return listainstrumento;
	}

	public void setListainstrumento(List<Instrumento> listainstrumento) {
		this.listainstrumento = listainstrumento;
	}

}
