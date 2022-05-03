package pe.edu.upc.entities;

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
@Table(name = "Estudio")
public class Estudio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CEstudio;

	@Column(name = "NEstudio", nullable = false, length = 50)
	private String NEstudio;

	@ManyToOne
	@JoinColumn(name = "CDistrito", nullable = false)
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "CDueño", nullable = false)
	private Dueño dueno;

	@Column(name = "NTelefono", nullable = false)
	private int NTelefono;

	@Column(name = "TDireccion", nullable = false, length = 50)
	private String TDireccion;

	public Estudio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudio(int cEstudio, String nEstudio, Distrito distrito, Dueño dueno, int nTelefono, String tDireccion) {
		super();
		CEstudio = cEstudio;
		NEstudio = nEstudio;
		this.distrito = distrito;
		this.dueno = dueno;
		NTelefono = nTelefono;
		TDireccion = tDireccion;
	}

	// Getters and Setters

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

	public int getNTelefono() {
		return NTelefono;
	}

	public void setNTelefono(int nTelefono) {
		NTelefono = nTelefono;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getTDireccion() {
		return TDireccion;
	}

	public void setTDireccion(String tDireccion) {
		TDireccion = tDireccion;
	}

	public Dueño getDueno() {
		return dueno;
	}

	public void setDueno(Dueño dueno) {
		this.dueno = dueno;
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
