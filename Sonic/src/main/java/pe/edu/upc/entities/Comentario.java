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
@Table(name = "Comentario")
public class Comentario {

	@Override
	public int hashCode() {
		return Objects.hash(CComentario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		return CComentario == other.CComentario;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CComentario;

	@Column(name = "TComentario", nullable = false, length = 500)
	private String TComentario;

	@Column(name = "FComentario", nullable = false)
	private Date FComentario;

	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario CUsuario;

	@ManyToOne
	@JoinColumn(name = "CPublicaion", nullable = false)
	private Publicacion CPublicacion;

	// constructores
	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentario(int cComentario, String tComentario, Date fComentario, Usuario cUsuario,
			Publicacion cPublicacion) {
		super();
		CComentario = cComentario;
		TComentario = tComentario;
		FComentario = fComentario;
		CUsuario = cUsuario;
		CPublicacion = cPublicacion;
	}

	// setters & getters
	public int getCComentario() {
		return CComentario;
	}

	public void setCComentario(int cComentario) {
		CComentario = cComentario;
	}

	public String getTComentario() {
		return TComentario;
	}

	public void setTComentario(String tComentario) {
		TComentario = tComentario;
	}

	public Date getFComentario() {
		return FComentario;
	}

	public void setFComentario(Date fComentario) {
		FComentario = fComentario;
	}

	public Usuario getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(Usuario cUsuario) {
		CUsuario = cUsuario;
	}

	public Publicacion getCPublicacion() {
		return CPublicacion;
	}

	public void setCPublicacion(Publicacion cPublicacion) {
		CPublicacion = cPublicacion;
	}

}
