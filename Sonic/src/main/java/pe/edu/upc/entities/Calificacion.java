package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Calificacion")
public class Calificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CCalificacion;
	
	@ManyToOne
	@JoinColumn(name = "CUSuario", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "CEstudio", nullable = false)
	private Estudio estudio;
	
	@Column(name = "Estrellas", nullable = false)
	private int QEstrellas;

	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calificacion(int cCalificacion, Usuario usuario, Estudio estudio, int qEstrellas) {
		super();
		CCalificacion = cCalificacion;
		this.usuario = usuario;
		this.estudio = estudio;
		QEstrellas = qEstrellas;
	}

	public int getCCalificacion() {
		return CCalificacion;
	}

	public void setCCalificacion(int cCalificacion) {
		CCalificacion = cCalificacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estudio getEstudio() {
		return estudio;
	}

	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}

	public int getQEstrellas() {
		return QEstrellas;
	}

	public void setQEstrellas(int qEstrellas) {
		QEstrellas = qEstrellas;
	}
	
	
	
}
