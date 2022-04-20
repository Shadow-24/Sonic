package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Reserva;
import pe.edu.upc.serviceinterfaces.IReservaService;

@Named
@RequestScoped
public class ReservaController {
	@Inject
	private IReservaService rService;

	// atributos
	private Reserva r;
	private List<Reserva> listareserva;

	// inicializar
	@PostConstruct
	public void init() {
		this.listareserva = new ArrayList<Reserva>();
		this.r = new Reserva();
		this.list();
	}

	// Métodos para atender peticiones

	public String newEstudio() {
		this.setR(new Reserva());
		return "master.xhtml";
	}

	public void insert() {
		try {
			rService.insert(r);
		} catch (Exception e) {
			System.out.println("Error al insertar reservas en el controller" + e.getStackTrace());
		}
	}

	public void list() {

		try {
			listareserva = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar reservas en el controller" + e.getStackTrace());
		}
	}

	public void delete(Reserva res) {
		try {
			rService.delete(res.getCReserva());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar reservas en el controlador de usuario");
		}

	}

	// getters & setters
	public Reserva getR() {
		return r;
	}

	public void setR(Reserva r) {
		this.r = r;
	}

	public List<Reserva> getListareserva() {
		return listareserva;
	}

	public void setListareserva(List<Reserva> listareserva) {
		this.listareserva = listareserva;
	}

}
