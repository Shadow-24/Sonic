package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marca")
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CMarca;

	@Column(name = "NMarca", nullable = false, length = 50)
	private String NMarca;

	public Marca() {
		super();
	}

	public Marca(int cMarca, String nMarca) {
		super();
		this.CMarca = cMarca;
		this.NMarca = nMarca;
	}

	public int getCMarca() {
		return CMarca;
	}

	public void setCMarca(int cMarca) {
		CMarca = cMarca;
	}

	public String getNMarca() {
		return NMarca;
	}

	public void setNMarca(String nMarca) {
		NMarca = nMarca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CMarca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return CMarca == other.CMarca;
	}

}
