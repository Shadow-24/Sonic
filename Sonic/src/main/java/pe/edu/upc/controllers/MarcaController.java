package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Marca;
import pe.edu.upc.serviceinterfaces.IMarcaService;

@Named
@RequestScoped
public class MarcaController {

	@Inject
	private IMarcaService mService;

	private Marca m;
	private List<Marca> listamarca;

	@PostConstruct
	public void init() {
		this.listamarca = new ArrayList<Marca>();
		this.m = new Marca();
		this.list();
	}

	public String newMarca() {
		this.setM(new Marca());
		return "master.xhtml";
	}

	public void insert() {
		try {
			mService.insert(m);
		} catch (Exception e) {
			System.out.println("Error al insertar marca en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listamarca = mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar marcas en el controller" + e.getStackTrace());
		}
	}

	public void findByNameMarca() {
		try {
			listamarca = mService.findByNameMarca(this.getM());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar marca en el controlador");
		}
	}

	public void delete(Marca mar) {
		try {
			mService.delete(mar.getCMarca());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar marcas en el controlador de Marca");
		}
	}

	public Marca getM() {
		return m;
	}

	public void setM(Marca m) {
		this.m = m;
	}

	public List<Marca> getListamarca() {
		return listamarca;
	}

	public String preUpdate(Marca m) {
		this.setM(m);
		return "modMarca.xhtml";
	}

	public void update() {
		try {
			mService.update(this.m);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar marca en el controlador");
		}
	}

	public void setListamarca(List<Marca> listamarca) {
		this.listamarca = listamarca;
	}

}
