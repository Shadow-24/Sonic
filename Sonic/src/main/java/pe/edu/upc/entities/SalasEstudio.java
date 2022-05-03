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
@Table(name = "SalasEstudio")
public class SalasEstudio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSalasEstudio;
	
	@ManyToOne
	@JoinColumn(name = "CEstudio", nullable = false)
	private Estudio estudio;
	
	@Column(name = "NSalasEstudio", nullable = false)
	private String NSalasEstudio;
	
	public SalasEstudio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalasEstudio(int idSalasEstudio, Estudio estudio, String nSalasEstudio) {
		super();
		this.idSalasEstudio = idSalasEstudio;
		this.estudio = estudio;
		NSalasEstudio = nSalasEstudio;
	}
	public int getIdSalasEstudio() {
		return idSalasEstudio;
	}
	public void setIdSalasEstudio(int idSalasEstudio) {
		this.idSalasEstudio = idSalasEstudio;
	}
	public Estudio getEstudio() {
		return estudio;
	}
	public void setEstudio(Estudio estudio) {
		this.estudio = estudio;
	}
	public String getNSalasEstudio() {
		return NSalasEstudio;
	}
	public void setNSalasEstudio(String nSalasEstudio) {
		NSalasEstudio = nSalasEstudio;
	}
	
}
