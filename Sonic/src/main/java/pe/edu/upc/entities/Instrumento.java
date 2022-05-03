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
@Table(name = "Instrumento")
public class Instrumento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CInstrumento;

	@Column(name = "NInstrumento", nullable = false, length = 50)
	private String NInstrumento;

	@ManyToOne
	@JoinColumn(name = "CMarca", nullable = false)
	private Marca marca;

	@ManyToOne
	@JoinColumn(name = "CTipoInstrumento", nullable = false)
	private TipoInstrumento tipoinstrumento;

	public Instrumento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instrumento(int cInstrumento, String nInstrumento, Marca marca, TipoInstrumento tipoinstrumento) {
		super();
		this.CInstrumento = cInstrumento;
		this.NInstrumento = nInstrumento;
		this.marca = marca;
		this.tipoinstrumento = tipoinstrumento;
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoInstrumento getTipoinstrumento() {
		return tipoinstrumento;
	}

	public void setTipoinstrumento(TipoInstrumento tipoinstrumento) {
		this.tipoinstrumento = tipoinstrumento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CInstrumento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrumento other = (Instrumento) obj;
		return CInstrumento == other.CInstrumento;
	}
	
}
