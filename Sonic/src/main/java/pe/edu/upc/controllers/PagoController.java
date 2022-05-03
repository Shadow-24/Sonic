package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.Pago;
import pe.edu.upc.serviceinterfaces.IPagoService;

@Named
@RequestScoped
public class PagoController {

	private IPagoService pService;
	
	private Pago p;
	private List<Pago> listapago;
	
	@PostConstruct
	public void init() {
		this.listapago = new ArrayList<Pago>();
		this.p=new Pago();
		this.list();
	}
	
	public String newPago() {
		this.setP(new Pago());
		return "master.xhtml";
	}
	
	public void insert() {
		try {
			pService.insert(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar pago en el controlador");
		}
	}
	
	public void list() {
		// TODO Auto-generated method stub
		try {
			listapago=pService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al lista los pagos en el controlador");
		}
	}

	public void delete(Pago pag) {
		try {
			pService.delete(pag.getCPago());
			this.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al eliminar pago en el controlador");
		}
	}
		
	
	
	public Pago getP() {
		return p;
	}
	public void setP(Pago p) {
		this.p = p;
	}
	
	public List<Pago> getListaPago(){
		return listapago;
	}
	
	public void setListaPago(List<Pago> listapago) {
		this.listapago = listapago;
	}
	
	
	
	
	
}
