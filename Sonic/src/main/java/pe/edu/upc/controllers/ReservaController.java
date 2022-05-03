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
	@Inject
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

	// modificar

	public String preUpdate(Reserva r) {

		this.setR(r);
		return "modicacion_reserva.xhtml";
	}

	public void Update() {

		try {
			rService.Update(this.r);
			this.list();

		} catch (Exception e) {
			System.out.println("Error al modificar reserva en el controlador");
		}
	}

	// buscar

	public void findByNameEstudio() {

		try {
			listareserva = rService.findByNameEscenario(this.getR());
		} catch (Exception e) {
			System.out.println("Error al buscar la reserva en el controlador");
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
