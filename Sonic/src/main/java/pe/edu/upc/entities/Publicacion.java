package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Publicacion")
public class Publicacion {

	@Override
	public int hashCode() {
		return Objects.hash(CPublicacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return CPublicacion == other.CPublicacion;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CPublicacion;

	@Column(name = "DPublicacion", nullable = false, length = 50)
	private String DPublicacion;

	@Column(name = "TPublicacion", nullable = false, length = 500)
	private String TPublicacion;

	@ManyToOne
	@JoinColumn(name = "CUSuario", nullable = false)
	private Usuario CUsuario;

	@Column(name = "FPublicacion", nullable = false)
	private Date FPublicacion;

	@ManyToOne
	@JoinColumn(name = "CInstrumento", nullable = false)
	private Instrumento CInstrumento;

	@Column(name = "QReacciones", nullable = false)
	private int QReacciones;

	// constructores
	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicacion(int cPublicacion, String dPublicacion, String tPublicacion, Usuario cUsuario, Date fPublicacion,
			Instrumento cInstrumento, int qReacciones) {
		super();
		CPublicacion = cPublicacion;
		DPublicacion = dPublicacion;
		TPublicacion = tPublicacion;
		CUsuario = cUsuario;
		FPublicacion = fPublicacion;
		CInstrumento = cInstrumento;
		QReacciones = qReacciones;
	}

	// getters & setters
	public int getCPublicacion() {
		return CPublicacion;
	}

	public void setCPublicacion(int cPublicacion) {
		CPublicacion = cPublicacion;
	}

	public String getDPublicacion() {
		return DPublicacion;
	}

	public void setDPublicacion(String dPublicacion) {
		DPublicacion = dPublicacion;
	}

	public String getTPublicacion() {
		return TPublicacion;
	}

	public void setTPublicacion(String tPublicacion) {
		TPublicacion = tPublicacion;
	}

	public Usuario getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(Usuario cUsuario) {
		CUsuario = cUsuario;
	}

	public Date getFPublicacion() {
		return FPublicacion;
	}

	public void setFPublicacion(Date fPublicacion) {
		FPublicacion = fPublicacion;
	}

	public Instrumento getCInstrumento() {
		return CInstrumento;
	}

	public void setCInstrumento(Instrumento cInstrumento) {
		CInstrumento = cInstrumento;
	}

	public int getQReacciones() {
		return QReacciones;
	}

	public void setQReacciones(int qReacciones) {
		QReacciones = qReacciones;
	}

}
