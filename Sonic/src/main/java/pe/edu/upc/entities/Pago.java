package pe.edu.upc.entities;

import java.util.Date;

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
	
	@Column(name = "Fecha", nullable = false)
	private Date Fecha;
	
	@Column(name = "Importe", nullable = false)
	private int Importe;
	
	@Column(name = "NTarjeta", nullable = false)
	private int NTarjeta;
	
	@Column(name = "ExpDate", nullable = false)
	private Date ExpDate;
	
	@Column(name = "CCvv", nullable = false)
	private int CCvv;
	
	@Column(name = "NImporte", nullable = false)
	private int NImporte;

	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pago(int cPago, Date fecha, int importe, int nTarjeta, Date expDate, int cCvv, int nImporte) {
		super();
		CPago = cPago;
		Fecha = fecha;
		Importe = importe;
		NTarjeta = nTarjeta;
		ExpDate = expDate;
		CCvv = cCvv;
		NImporte = nImporte;
	}

	public int getCPago() {
		return CPago;
	}

	public void setCPago(int cPago) {
		CPago = cPago;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public int getImporte() {
		return Importe;
	}

	public void setImporte(int importe) {
		Importe = importe;
	}

	public int getNTarjeta() {
		return NTarjeta;
	}

	public void setNTarjeta(int nTarjeta) {
		NTarjeta = nTarjeta;
	}

	public Date getExpDate() {
		return ExpDate;
	}

	public void setExpDate(Date expDate) {
		ExpDate = expDate;
	}

	public int getCCvv() {
		return CCvv;
	}

	public void setCCvv(int cCvv) {
		CCvv = cCvv;
	}

	public int getNImporte() {
		return NImporte;
	}

	public void setNImporte(int nImporte) {
		NImporte = nImporte;
	}
	
	
}
