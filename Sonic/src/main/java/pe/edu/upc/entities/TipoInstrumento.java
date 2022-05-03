package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoInstrumento")
public class TipoInstrumento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CTipoInstrumento;

	@Column(name = "NTipoInstrumento", nullable = false, length = 50)
	private String NTipoInstrumento;

	public TipoInstrumento() {
		super();

	}

	public TipoInstrumento(int cTipoInstrumento, String nTipoInstrumento) {
		super();
		CTipoInstrumento = cTipoInstrumento;
		NTipoInstrumento = nTipoInstrumento;
	}

	public int getCTipoInstrumento() {
		return CTipoInstrumento;
	}

	public void setCTipoInstrumento(int cTipoInstrumento) {
		CTipoInstrumento = cTipoInstrumento;
	}

	public String getNTipoInstrumento() {
		return NTipoInstrumento;
	}

	public void setNTipoInstrumento(String nTipoInstrumento) {
		NTipoInstrumento = nTipoInstrumento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CTipoInstrumento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoInstrumento other = (TipoInstrumento) obj;
		return CTipoInstrumento == other.CTipoInstrumento;
	}

}
