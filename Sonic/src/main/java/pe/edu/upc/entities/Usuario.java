package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Override
	public int hashCode() {
		return Objects.hash(CUSuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return CUSuario == other.CUSuario;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CUSuario;

	@Column(name = "DUserName", nullable = false, length = 20)
	private String DUserName;

	@Column(name = "NNombre", nullable = false, length = 50)
	private String NNombre;

	@Column(name = "NApellido", nullable = false, length = 50)
	private String NApellido;

	@Column(name = "NumCelular", nullable = false)
	private int NumCelular;

	@Column(name = "DCorreo", nullable = false)
	private String DCorreo;

	@Column(name = "DPassword", nullable = false)
	private String DPassword;

	@Column(name = "NDistrito", nullable = false, length = 40)
	private String NDistrito;

	@Column(name = "NGeneros", nullable = false, length = 20)
	private String NGeneros;

	// constructor
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUSuario, String dUserName, String nNombre, String nApellido, int numCelular, String dCorreo,
			String dPassword, String nDistrito, String nGeneros) {
		super();
		CUSuario = cUSuario;
		DUserName = dUserName;
		NNombre = nNombre;
		NApellido = nApellido;
		NumCelular = numCelular;
		DCorreo = dCorreo;
		DPassword = dPassword;
		NDistrito = nDistrito;
		NGeneros = nGeneros;
	}

	// setters & getters
	public int getCUSuario() {
		return CUSuario;
	}

	public void setCUSuario(int cUSuario) {
		CUSuario = cUSuario;
	}

	public String getDUserName() {
		return DUserName;
	}

	public void setDUserName(String dUserName) {
		DUserName = dUserName;
	}

	public String getNNombre() {
		return NNombre;
	}

	public void setNNombre(String nNombre) {
		NNombre = nNombre;
	}

	public String getNApellido() {
		return NApellido;
	}

	public void setNApellido(String nApellido) {
		NApellido = nApellido;
	}

	public int getNumCelular() {
		return NumCelular;
	}

	public void setNumCelular(int numCelular) {
		NumCelular = numCelular;
	}

	public String getDCorreo() {
		return DCorreo;
	}

	public void setDCorreo(String dCorreo) {
		DCorreo = dCorreo;
	}

	public String getDPassword() {
		return DPassword;
	}

	public void setDPassword(String dPassword) {
		DPassword = dPassword;
	}

	public String getNDistrito() {
		return NDistrito;
	}

	public void setNDistrito(String nDistrito) {
		NDistrito = nDistrito;
	}

	public String getNGeneros() {
		return NGeneros;
	}

	public void setNGeneros(String nGeneros) {
		NGeneros = nGeneros;
	}

}
