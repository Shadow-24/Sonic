package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.MetodoPago;
import pe.edu.upc.serviceinterfaces.IMetodoPagoService;

@Named
@RequestScoped
public class MetodoPagoController {
	
	@Inject
	private IMetodoPagoService mpService;
	
	private MetodoPago mp;
	private List<MetodoPago> listametodopago;
	
	public void Init() {
		this.listametodopago=new ArrayList<MetodoPago>();
		this.mp=new MetodoPago();
		this.list();
	}

	public String newMetodoPago() {
		this.setMp(new MetodoPago());
		return "master.xhtml";
	}
	
	public void insert() {
		try {
			mpService.insert(mp);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar metodo de pago en el controller"+e.getStackTrace());
		}
	}
	
	public void list() {
		try {
			listametodopago = mpService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar metodos de pago en el controlador");
		}
	}
	
	public void delete(MetodoPago mepa) {
		try {
			mpService.delete(mepa.getCMetodo());
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar metodo de pago en el controlador");
		}
	}
	
	public void findByNameMetodoPago() {
		try {
			listametodopago=mpService.finByNameMetodoPago(this.getMp());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al buscar metodo de pago en el controlador");
		}
	}
	
	public MetodoPago getMp() {
		return mp;
	}

	public void setMp(MetodoPago mp) {
		this.mp = mp;
	}

	public List<MetodoPago> getListametodopago() {
		return listametodopago;
	}

	public void setListametodopago(List<MetodoPago> listametodopago) {
		this.listametodopago = listametodopago;
	}
	
	public String preUpdate(MetodoPago mp) {
		this.setMp(mp);
		return "modMetodoPago.xhtml";
	}
	
	public void update() {
		try {
			mpService.update(this.mp);
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al modificar el metodo de pago en el controlador");
		}
	}
}
