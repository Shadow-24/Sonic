package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distrito")
public class Distrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CDistrito;

	@Column(name = "NDistrito", nullable = false, length = 45)
	private String NDistrito;

	public Distrito(int cDistrito, String nDistrito) {
		super();
		CDistrito = cDistrito;
		NDistrito = nDistrito;
	}

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCDistrito() {
		return CDistrito;
	}

	public void setCDistrito(int cDistrito) {
		CDistrito = cDistrito;
	}

	public String getNDistrito() {
		return NDistrito;
	}

	public void setNDistrito(String nDistrito) {
		NDistrito = nDistrito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CDistrito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distrito other = (Distrito) obj;
		return CDistrito == other.CDistrito;
	}
	
	
}
