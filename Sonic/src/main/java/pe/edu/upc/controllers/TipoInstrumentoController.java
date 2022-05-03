package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoInstrumento;
import pe.edu.upc.serviceinterfaces.ITipoInstrumentoService;

@Named
@RequestScoped
public class TipoInstrumentoController {

	@Inject
	private ITipoInstrumentoService tiService;

	private TipoInstrumento ti;
	private List<TipoInstrumento> listatipoinstrumento;

	@PostConstruct
	public void init() {
		this.listatipoinstrumento = new ArrayList<TipoInstrumento>();
		this.ti = new TipoInstrumento();
		this.list();
	}

	public String newTipoInstrumento() {
		this.setTi(new TipoInstrumento());
		return "master.xhtml";
	}

	public void insert() {
		try {
			tiService.insert(ti);
		} catch (Exception e) {
			System.out.println("Error al insertar tipoinstrumento en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listatipoinstrumento = tiService.list();
		} catch (Exception e) {
			System.out.println("Error al listar tipoinstrumento en el controller" + e.getStackTrace());
		}
	}

	public void findByNameTipoInstrumento() {
		try {
			listatipoinstrumento = tiService.findByNameTipoInstrumento(this.getTi());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar tipoinstrumento en el controlador");
		}
	}

	public void delete(TipoInstrumento tins) {
		try {
			tiService.delete(tins.getCTipoInstrumento());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar tipoinstrumento en el controlador de TipoInstrumento");
		}
	}

	public TipoInstrumento getTi() {
		return ti;
	}

	public void setTi(TipoInstrumento ti) {
		this.ti = ti;
	}

	public List<TipoInstrumento> getListatipoinstrumento() {
		return listatipoinstrumento;
	}

	public String preUpdate(TipoInstrumento ti) {
		this.setTi(ti);
		return "modTipoInstrumento.xhtml";
	}

	public void update() {
		try {
			tiService.update(this.ti);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar tipoinstrumento en el controlador");
		}
	}

	public void setListatipoinstrumento(List<TipoInstrumento> listatipoinstrumento) {
		this.listatipoinstrumento = listatipoinstrumento;
	}

}
