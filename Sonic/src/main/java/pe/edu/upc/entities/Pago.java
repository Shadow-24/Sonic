package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pago")
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CPago;
	
	@Column(name = "Reserva", nullable = false)
	private int CReserva;
	
	@Column(name = "Monto", nullable = false)
	private int QMonto;
	
	@Column(name = "Metodo", nullable = false)
	private int CMetodo;
	
	

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getCPago() {
		return CPago;
	}

	public void setCPago(int cPago) {
		CPago = cPago;
	}


	public int getCReserva() {
		return CReserva;
	}


	public void setCReserva(int cReserva) {
		CReserva = cReserva;
	}


	public int getQMonto() {
		return QMonto;
	}


	public void setQMonto(int qMonto) {
		QMonto = qMonto;
	}


	public int getCMetodo() {
		return CMetodo;
	}


	public void setCMetodo(int cMetodo) {
		CMetodo = cMetodo;
	}

	
	
}
