package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Estudio;
import pe.edu.upc.entities.Instrumento;
import pe.edu.upc.entities.Marca;
import pe.edu.upc.entities.TipoInstrumento;
import pe.edu.upc.serviceinterfaces.IEstudioService;
import pe.edu.upc.serviceinterfaces.IInstrumentoService;
import pe.edu.upc.serviceinterfaces.IMarcaService;
import pe.edu.upc.serviceinterfaces.ITipoInstrumentoService;

@Named
@RequestScoped
public class InstrumentoController {

	@Inject
	private IInstrumentoService iService;
	@Inject
	private IMarcaService mService;
	@Inject
	private ITipoInstrumentoService tiService;
	@Inject
	private IEstudioService eService;
	// atributos
	private Instrumento i;
	private List<Instrumento> listainstrumento;
	private List<Marca> listaMarcas;
	private List<TipoInstrumento> listaTipoInstrumentos;
	private List<Estudio> listaEstudios;

	// inicializar
	@PostConstruct
	public void init() {
		this.listainstrumento = new ArrayList<Instrumento>();
		this.i = new Instrumento();
		this.list();
		this.listMarcas();
		this.listTipoInstrumentos();
		this.listEstudios();
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

	public void listEstudios() {
		try {
			listaEstudios = eService.list();
		} catch (Exception e) {
			System.out.println("Error al listar estudios en controller instrumento");
		}
	}

	public void listMarcas() {
		try {
			listaMarcas = mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar marcas en controller instrumento");
		}
	}

	public void listTipoInstrumentos() {
		try {
			listaTipoInstrumentos = tiService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipoinstrumento en controller instrumento");
		}
	}

	public void findByNameInstrumento() {
		try {
			listainstrumento = iService.findByNameInstrumento(this.getI());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar instrumento en el controlador");
		}
	}

	public void delete(Instrumento ins) {
		try {
			iService.delete(ins.getCInstrumento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar instrumentos en el controlador de instrumento");
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

	public String preUpdate(Instrumento i) {
		this.setI(i);
		return "modInstrumento.xhtml";
	}

	public List<Estudio> getListaEstudios() {
		return listaEstudios;
	}

	public void setListaEstudios(List<Estudio> listaEstudios) {
		this.listaEstudios = listaEstudios;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}

	public List<TipoInstrumento> getListaTipoInstrumentos() {
		return listaTipoInstrumentos;
	}

	public void setListaTipoInstrumentos(List<TipoInstrumento> listaTipoInstrumentos) {
		this.listaTipoInstrumentos = listaTipoInstrumentos;
	}

	public void update() {
		try {
			iService.update(this.i);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar instrumento en el controlador");
		}
	}

	public void setListainstrumento(List<Instrumento> listainstrumento) {
		this.listainstrumento = listainstrumento;
	}
}
