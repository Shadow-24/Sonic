package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Musico;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IMusicoService;
import pe.edu.upc.serviceinterfaces.IUsuarioService;


@Named
@RequestScoped
public class MusicoController {

	@Inject
	private IMusicoService mService;

	@Inject
	private IUsuarioService uService;

	@Inject
	private Musico m;

	List<Musico> listamusicos;
	List<Usuario> listausuarios;

	@PostConstruct
	public void init() {
		this.m = new Musico();
		this.listamusicos = new ArrayList<Musico>();
		this.listausuarios = new ArrayList<Usuario>();
		this.list();
		this.listaUsuarios();
	}

	// metodos
	public void insert() {

		try {
			mService.insert(m);
		} catch (Exception e) {
			System.out.println("Error al insertar musicos en el controlador");
		}
	}

	public void list() {

		try {
			listamusicos = mService.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void listaUsuarios() {

		try {
			listausuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de musicos");
		}
	}

	// eliminar

	public void delete(Musico mu) {

		try {
			mService.delete(mu.getCMusico());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar musico en el controlador de publicacion");
		}

	}

	public String preUpdate(Musico m) {

		this.setM(m);
		return "modificacion_musico.xhtml";

	}

	public void Update() {

		try {
			mService.update(this.m);
			this.list();
		} catch (Exception e) {
			System.out.println("Error al modificar musico en el controlador");
		}
	}

	// buscar

	public void findByNameCodigo() {

		try {
			listamusicos = mService.findByNamePublicacion(this.getM());
		} catch (Exception e) {
			System.out.println("Error al buscar el musico en el controlador");
		}
	}

	// setters & getters
	public Musico getM() {
		return m;
	}

	public void setM(Musico m) {
		this.m = m;
	}

	public List<Musico> getListamusicos() {
		return listamusicos;
	}

	public void setListamusicos(List<Musico> listamusicos) {
		this.listamusicos = listamusicos;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

}
