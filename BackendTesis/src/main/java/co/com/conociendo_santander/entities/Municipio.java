/**
 * 
 */
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "municipios")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idMunicipio")
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_municipio")
	private Long idMunicipio;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "longitud")
	private String longitud;

	@Column(name = "latitud")
	private String latitud;

	@Column(name = "basica")
	private String basica;

	@Column(name = "extensa")
	private String extensa;

	@Column(name = "foto")
	private String foto;

	@Column(name = "escudo")
	private String escudo;

	@Column(name = "bandera")
	private String bandera;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "departamento")
	private Departamento departamento;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<Alojamiento> alojamientos;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<Atractivo> atractivos;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<Foto> fotos;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<Restaurante> restaurantes;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<UsuarioMunicipio> usuariosMunicipios;

	@JsonBackReference
	@OneToMany(mappedBy = "municipio")
	private List<Ruta> rutas;

	/**
	 * @param rutas
	 * @param alojamientos
	 * @param atractivos
	 * @param fotos
	 * @param restaurantes
	 */
	public Municipio() {
		this.usuariosMunicipios = new ArrayList<UsuarioMunicipio>();
		this.rutas = new ArrayList<Ruta>();
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
	public String getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public String getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the basica
	 */
	public String getBasica() {
		return basica;
	}

	/**
	 * @param basica the basica to set
	 */
	public void setBasica(String basica) {
		this.basica = basica;
	}

	/**
	 * @return the extensa
	 */
	public String getExtensa() {
		return extensa;
	}

	/**
	 * @param extensa the extensa to set
	 */
	public void setExtensa(String extensa) {
		this.extensa = extensa;
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

	/**
	 * @return the usuariosMunicipios
	 */
	public List<UsuarioMunicipio> getUsuariosMunicipios() {
		return usuariosMunicipios;
	}

	/**
	 * @param usuariosMunicipios the usuariosMunicipios to set
	 */
	public void setUsuariosMunicipios(List<UsuarioMunicipio> usuariosMunicipios) {
		this.usuariosMunicipios = usuariosMunicipios;
	}

	/**
	 * @return the rutas
	 */
	public List<Ruta> getRutas() {
		return rutas;
	}

	/**
	 * @param rutas the rutas to set
	 */
	public void setRutas(List<Ruta> rutas) {
		this.rutas = rutas;
	}

	/**
	 * @return the escudo
	 */
	public String getEscudo() {
		return escudo;
	}

	/**
	 * @param escudo the escudo to set
	 */
	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	/**
	 * @return the bandera
	 */
	public String getBandera() {
		return bandera;
	}

	/**
	 * @param bandera the bandera to set
	 */
	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

}
