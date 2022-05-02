package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Escenario")
public class Estudio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CEstudio;

	@Column(name = "NEstudio", nullable = false, length = 50)
	private String NEstudio;

	@Column(name = "CDistrito", nullable = false, length = 50)
	private String CDistrito;

	@Column(name = "CInstrumento", nullable = false, length = 40)
	private String CInstrumento;

	@Column(name = "NTelefono", nullable = false)
	private int NTelefono;

	@Column(name = "NCalificacion", nullable = false, length = 20)
	private String NCalificacion;

	public Estudio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudio(int cEstudio, String nEstudio, String cDistrito, String cInstrumento, int nTelefono,
			String nCalificacion) {
		super();
		CEstudio = cEstudio;
		NEstudio = nEstudio;
		CDistrito = cDistrito;
		CInstrumento = cInstrumento;
		NTelefono = nTelefono;
		NCalificacion = nCalificacion;
	}

	public int getCEstudio() {
		return CEstudio;
	}

	public void setCEstudio(int cEstudio) {
		CEstudio = cEstudio;
	}

	public String getNEstudio() {
		return NEstudio;
	}

	public void setNEstudio(String nEstudio) {
		NEstudio = nEstudio;
	}

	public String getCDistrito() {
		return CDistrito;
	}

	public void setCDistrito(String cDistrito) {
		CDistrito = cDistrito;
	}

	public String getCInstrumento() {
		return CInstrumento;
	}

	public void setCInstrumento(String cInstrumento) {
		CInstrumento = cInstrumento;
	}

	public int getNTelefono() {
		return NTelefono;
	}

	public void setNTelefono(int nTelefono) {
		NTelefono = nTelefono;
	}

	public String getNCalificacion() {
		return NCalificacion;
	}

	public void setNCalificacion(String nCalificacion) {
		NCalificacion = nCalificacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CEstudio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudio other = (Estudio) obj;
		return CEstudio == other.CEstudio;
	}

	
	
}
