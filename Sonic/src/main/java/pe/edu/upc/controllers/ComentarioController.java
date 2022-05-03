package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Comentario;
import pe.edu.upc.entities.Publicacion;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IComentarioService;
import pe.edu.upc.serviceinterfaces.IPublicacionService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class ComentarioController {

	@Inject
	private IComentarioService coService;

	@Inject
	private IUsuarioService uService;

	@Inject
	private IPublicacionService pService;

	@Inject
	private Comentario co;

	List<Comentario> listacomentarios;
	List<Usuario> listausuarios;
	List<Publicacion> listapublicaciones;

	@PostConstruct
	public void init() {

		this.co = new Comentario();
		this.listacomentarios = new ArrayList<Comentario>();
		this.listausuarios = new ArrayList<Usuario>();
		this.listapublicaciones = new ArrayList<Publicacion>();
		this.list();
		this.listPublicaciones();
		this.listUsuarios();
	}

	// metodos

	public void insert() {

		try {
			coService.insert(co);
		} catch (Exception e) {
			System.out.println("Error al insertar comentarios en el controlador");
		}
	}

	public void list() {
		try {
			listacomentarios = coService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void listUsuarios() {

		try {
			listausuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de comentarios");
		}
	}

	public void listPublicaciones() {

		try {
			listapublicaciones = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar publicaciones en el controlador de comentarios");
		}
	}

	public void delete(Comentario co) {
		try {
			coService.delete(co.getCComentario());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar comentario en el controlador de comentario");
		}

	}

	// modificar
	public String preUpdate(Comentario co) {

		this.setCo(co);
		return "modificacion_comentario.xhtml";
	}

	public void Update() {

		try {
			coService.update(this.co);
			this.list();
		} catch (Exception e) {
			System.out.println("Error al modificar comentario en el controlador");
		}
	}

	// setters & getters
	public Comentario getCo() {
		return co;
	}

	public void setCo(Comentario co) {
		this.co = co;
	}

	public List<Comentario> getListacomentarios() {
		return listacomentarios;
	}

	public void setListacomentarios(List<Comentario> listacomentarios) {
		this.listacomentarios = listacomentarios;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

	public List<Publicacion> getListapublicaciones() {
		return listapublicaciones;
	}

	public void setListapublicaciones(List<Publicacion> listapublicaciones) {
		this.listapublicaciones = listapublicaciones;
	}

}
