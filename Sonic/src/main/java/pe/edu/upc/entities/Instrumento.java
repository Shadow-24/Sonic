package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Instrumento")
public class Instrumento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CInstrumento;

	@Column(name = "NInstrumento", nullable = false, length = 50)
	private String NInstrumento;

	@Column(name = "CMarca", nullable = false, length = 50)
	private String CMarca;

	@Column(name = "DTipo_Instrumento", nullable = false, length = 30)
	private String DTipo_Instrumento;

	public Instrumento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instrumento(int cInstrumento, String nInstrumento, String cMarca, String dTipo_Instrumento) {
		super();
		CInstrumento = cInstrumento;
		NInstrumento = nInstrumento;
		CMarca = cMarca;
		DTipo_Instrumento = dTipo_Instrumento;
	}

	public int getCInstrumento() {
		return CInstrumento;
	}

	public void setCInstrumento(int cInstrumento) {
		CInstrumento = cInstrumento;
	}

	public String getNInstrumento() {
		return NInstrumento;
	}

	public void setNInstrumento(String nInstrumento) {
		NInstrumento = nInstrumento;
	}

	public String getCMarca() {
		return CMarca;
	}

	public void setCMarca(String cMarca) {
		CMarca = cMarca;
	}

	public String getDTipo_Instrumento() {
		return DTipo_Instrumento;
	}

	public void setDTipo_Instrumento(String dTipo_Instrumento) {
		DTipo_Instrumento = dTipo_Instrumento;
	}

}
