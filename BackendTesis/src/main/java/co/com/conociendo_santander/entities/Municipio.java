/**
 * 
 */
package co.com.conociendo_santander.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "municipios")
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_municipio")
	private Long idMunicipio;

	@Column(name = "nombre_municipio")
	private String nombre;

	@Column(name = "longitud_municipio")
	private double longitud;

	@Column(name = "latitud_municipio")
	private double latitud;

	@Column(name = "descripcion_basica_municipio")
	private String descripcionBasica;

	@Column(name = "descripcion_larga_municipio")
	private String descripcionLarga;

	@Column(name = "id_instagram")
	private int idInstagram;

	@Column(name = "foto_municipio")
	private String foto;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;

	@OneToMany(mappedBy = "municipio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Alojamiento> alojamientos;

	@OneToMany(mappedBy = "municipio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Atractivo> atractivos;

	@OneToMany(mappedBy = "municipio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Foto> fotos;

	@OneToMany(mappedBy = "municipio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Restaurante> restaurantes;

	/**
	 * @param alojamientos
	 * @param atractivos
	 * @param fotos
	 * @param restaurantes
	 */
	public Municipio() {
		super();
		this.alojamientos = new ArrayList<Alojamiento>();
		this.atractivos = new ArrayList<Atractivo>();
		this.fotos = new ArrayList<Foto>();
		this.restaurantes = new ArrayList<Restaurante>();
	}

	/**
	 * @return the idMunicipio
	 */
	public Long getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the descripcionBasica
	 */
	public String getDescripcionBasica() {
		return descripcionBasica;
	}

	/**
	 * @param descripcionBasica the descripcionBasica to set
	 */
	public void setDescripcionBasica(String descripcionBasica) {
		this.descripcionBasica = descripcionBasica;
	}

	/**
	 * @return the descripcionLarga
	 */
	public String getDescripcionLarga() {
		return descripcionLarga;
	}

	/**
	 * @param descripcionLarga the descripcionLarga to set
	 */
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}

	/**
	 * @return the idInstagram
	 */
	public int getIdInstagram() {
		return idInstagram;
	}

	/**
	 * @param idInstagram the idInstagram to set
	 */
	public void setIdInstagram(int idInstagram) {
		this.idInstagram = idInstagram;
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
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the alojamientos
	 */
	public List<Alojamiento> getAlojamientos() {
		return alojamientos;
	}

	/**
	 * @param alojamientos the alojamientos to set
	 */
	public void setAlojamientos(List<Alojamiento> alojamientos) {
		this.alojamientos = alojamientos;
	}

	/**
	 * @return the atractivos
	 */
	public List<Atractivo> getAtractivos() {
		return atractivos;
	}

	/**
	 * @param atractivos the atractivos to set
	 */
	public void setAtractivos(List<Atractivo> atractivos) {
		this.atractivos = atractivos;
	}

	/**
	 * @return the fotos
	 */
	public List<Foto> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

}
