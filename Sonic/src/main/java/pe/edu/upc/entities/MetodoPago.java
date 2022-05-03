package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MetodoPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CMetodo;
	
	@Column(name="Metodo", nullable=false)
	private int DMetodo;

	
		
	public MetodoPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCMetodo() {
		return CMetodo;
	}

	public void setCMetodo(int cMetodo) {
		CMetodo = cMetodo;
	}

	public int getDMetodo() {
		return DMetodo;
	}

	public void setDMetodo(int dMetodo) {
		DMetodo = dMetodo;
	}
	
	
}
