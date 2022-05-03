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
@Table(name = "Musico")
public class Musico {

	@Override
	public int hashCode() {
		return Objects.hash(CMusico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musico other = (Musico) obj;
		return CMusico == other.CMusico;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CMusico;

	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario CUsuario;

	@Column(name = "DMusico", nullable = false, length = 20)
	private String DMusico;

	// constructores
	public Musico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Musico(int cMusico, Usuario cUsuario, String dMusico) {
		super();
		CMusico = cMusico;
		CUsuario = cUsuario;
		DMusico = dMusico;
	}

	// getters & setters

	public String getDMusico() {
		return DMusico;
	}

	public int getCMusico() {
		return CMusico;
	}

	public void setCMusico(int cMusico) {
		CMusico = cMusico;
	}

	public Usuario getCUsuario() {

		return CUsuario;
	}

	public void setCUsuario(Usuario cUsuario) {
		CUsuario = cUsuario;
	}

	public void setDMusico(String dMusico) {
		DMusico = dMusico;
	}

}
