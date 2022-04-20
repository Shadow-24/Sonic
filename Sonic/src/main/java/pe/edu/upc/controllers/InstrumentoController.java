package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Instrumento;
import pe.edu.upc.serviceinterfaces.IInstrumentoService;

@Named
@RequestScoped
public class InstrumentoController {

	@Inject
	private IInstrumentoService iService;

	// atributos
	private Instrumento i;
	private List<Instrumento> listainstrumento;

	// inicializar
	@PostConstruct
	public void init() {
		this.listainstrumento = new ArrayList<Instrumento>();
		this.i = new Instrumento();
		this.list();
	}

	// metodos para atender peticiones
	public String newInstrumento() {
		this.setI(new Instrumento());
		return "master.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
		} catch (Exception e) {
			System.out.println("Error al insertar instrumentos en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listainstrumento = iService.list();
		} catch (Exception e) {
			System.out.println("Error al listar instrumentos en el controller" + e.getStackTrace());
		}
	}

	public void delete(Instrumento ins) {
		try {
			iService.delete(ins.getCInstrumento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar instrumentos en el controlador de usuario");
		}
	}

	// getters & setters
	public Instrumento getI() {
		return i;
	}

	public void setI(Instrumento i) {
		this.i = i;
	}

	public List<Instrumento> getListainstrumento() {
		return listainstrumento;
	}

	public void setListainstrumento(List<Instrumento> listainstrumento) {
		this.listainstrumento = listainstrumento;
	}
}
