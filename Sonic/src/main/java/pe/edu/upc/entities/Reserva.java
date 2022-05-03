package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reserva")
public class Reserva {

	@Override
	public int hashCode() {
		return Objects.hash(CReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return CReserva == other.CReserva;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CReserva;

	@Column(name = "Fecha", nullable = false)
	private Date Fecha;

	@Column(name = "CDuenio", nullable = false, length = 50)
	private String CDuenio;

	@Column(name = "CMusico", nullable = false, length = 50)
	private String CMusico;

	@Column(name = "CEstudio", nullable = false, length = 50)
	private String CEstudio;

	@Column(name = "CMetodo_Pago", nullable = false, length = 50)
	private String CMetodo_Pago;

	@Column(name = "QCant_Horas", nullable = false)
	private int QCant_Horas;

	@Column(name = "QCant_Personas", nullable = false)
	private int QCant_Personas;

	@Column(name = "CPago", nullable = false)
	private int CPago;

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int cReserva, Date fecha, String cDuenio, String cMusico, String cEstudio, String cMetodo_Pago,
			int qCant_Horas, int qCant_Personas, int cPago) {
		super();
		CReserva = cReserva;
		Fecha = fecha;
		CDuenio = cDuenio;
		CMusico = cMusico;
		CEstudio = cEstudio;
		CMetodo_Pago = cMetodo_Pago;
		QCant_Horas = qCant_Horas;
		QCant_Personas = qCant_Personas;
		CPago = cPago;
	}

	public int getCReserva() {
		return CReserva;
	}

	public void setCReserva(int cReserva) {
		CReserva = cReserva;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getCDuenio() {
		return CDuenio;
	}

	public void setCDuenio(String cDuenio) {
		CDuenio = cDuenio;
	}

	public String getCMusico() {
		return CMusico;
	}

	public void setCMusico(String cMusico) {
		CMusico = cMusico;
	}

	public String getCEstudio() {
		return CEstudio;
	}

	public void setCEstudio(String cEstudio) {
		CEstudio = cEstudio;
	}

	public String getCMetodo_Pago() {
		return CMetodo_Pago;
	}

	public void setCMetodo_Pago(String cMetodo_Pago) {
		CMetodo_Pago = cMetodo_Pago;
	}

	public int getQCant_Horas() {
		return QCant_Horas;
	}

	public void setQCant_Horas(int qCant_Horas) {
		QCant_Horas = qCant_Horas;
	}

	public int getQCant_Personas() {
		return QCant_Personas;
	}

	public void setQCant_Personas(int qCant_Personas) {
		QCant_Personas = qCant_Personas;
	}

	public int getCPago() {
		return CPago;
	}

	public void setCPago(int cPago) {
		CPago = cPago;
	}

}
