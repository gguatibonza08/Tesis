package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "departamentos")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idDepartamento")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Long idDepartamento;

	@Column(name = "nombre")
	private String nombreDepartamento;

	@Column(name = "longitud")
	private String longitudDepartamento;

	@Column(name = "latitud")
	private String latitudDepartamento;

	@Column(name = "foto")
	private String foto;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pais")
	private Pais pais;

	@JsonIgnore
	@OneToMany(mappedBy = "departamento")
	private List<Municipio> municipios;

	/**
	 * @param municipios
	 */
	public Departamento() {
		this.municipios = new ArrayList<Municipio>();
	}

	/**
	 * @return the idDepartamento
	 */
	public Long getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(Long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * @return the nombreDepartamento
	 */
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	/**
	 * @param nombreDepartamento the nombreDepartamento to set
	 */
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	/**
	 * @return the longitudDepartamento
	 */
	public String getLongitudDepartamento() {
		return longitudDepartamento;
	}

	/**
	 * @param longitudDepartamento the longitudDepartamento to set
	 */
	public void setLongitudDepartamento(String longitudDepartamento) {
		this.longitudDepartamento = longitudDepartamento;
	}

	/**
	 * @return the latitudDepartamento
	 */
	public String getLatitudDepartamento() {
		return latitudDepartamento;
	}

	/**
	 * @param latitudDepartamento the latitudDepartamento to set
	 */
	public void setLatitudDepartamento(String latitudDepartamento) {
		this.latitudDepartamento = latitudDepartamento;
	}

	/**
	 * @return the municipios
	 */
	public List<Municipio> getMunicipios() {
		return municipios;
	}

	/**
	 * @param municipios the municipios to set
	 */
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public void addMunicipio(Municipio municipio) {
		municipios.add(municipio);
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
