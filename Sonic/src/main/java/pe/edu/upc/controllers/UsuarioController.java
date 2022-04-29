package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.serviceinterfaces.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	
	@Inject
	private IUsuarioService uService;

	// atributos
	private Usuario u;
	private List<Usuario> listausuarios;

	// inicializar
	@PostConstruct
	public void init() {
		this.listausuarios = new ArrayList<Usuario>();
		this.u = new Usuario();
		this.list();
	}

	// Métodos para atender peticiones
	public String newUsuario() {
		this.setU(new Usuario());
		return "master.xhtml";
	}

	public void insert() {
		try {
			uService.insert(u);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listausuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller" + e.getStackTrace());
		}
	}

	//BUSCAR 
	public void findByNameUsuario()  {
		try {
			//Llena una nueva lista con los usuarios del metodo
			listausuarios=uService.findByNameVaccine(this.getU());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar usuario en el controlador");
		}
	}
	
	
	public void delete(Usuario us) {
		try {
			uService.delete(us.getCUSuario());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de usuario");
		}
	}

	// getters & setters
	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}
	
	/////UPDATE
	public String preUpdate(Usuario us) {
		this.setU(us);
		return "modificacion.xhtml";
	}
	
	public void update() {
		try {
			uService.update(this.u);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar vacunacion en el controlador");
		}
	}
	
	
	
	
	public void setListausuarios(List<Usuario> listausuarios) {
	
		this.listausuarios = listausuarios;
	}
}
