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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "logros")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idLogro")
public class Logro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_logro")
	private Long idLogro;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "insignia")
	private String insignia;

	@JsonBackReference
	@OneToMany(mappedBy = "logro")
	private List<LogroObjetivo> objetivosDelLogro;

	@JsonBackReference
	@OneToMany(mappedBy = "logro")
	private List<UsuarioLogro> usuariosPorLogro;

	/**
	 * @param objetivosDelLogro
	 * @param usuariosPorLogro
	 */
	public Logro() {
		this.objetivosDelLogro = new ArrayList<LogroObjetivo>();
		this.usuariosPorLogro = new ArrayList<UsuarioLogro>();
	}

	/**
	 * @return the idLogro
	 */
	public Long getIdLogro() {
		return idLogro;
	}

	/**
	 * @param idLogro the idLogro to set
	 */
	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the insignia
	 */
	public String getInsignia() {
		return insignia;
	}

	/**
	 * @param insignia the insignia to set
	 */
	public void setInsignia(String insignia) {
		this.insignia = insignia;
	}

	/**
	 * @return the logrosDelObjetivo
	 */
	public List<LogroObjetivo> getObjetivosDelLogro() {
		return objetivosDelLogro;
	}

	/**
	 * @param logrosDelObjetivo the logrosDelObjetivo to set
	 */
	public void setObjetivosDelLogro(List<LogroObjetivo> objetivosDelLogro) {
		this.objetivosDelLogro = objetivosDelLogro;
	}

	public void addObjetivoLogro(LogroObjetivo logroObjetivo) {
		objetivosDelLogro.add(logroObjetivo);
	}

	/**
	 * @return the usuariosPorLogro
	 */
	public List<UsuarioLogro> getUsuariosPorLogro() {
		return usuariosPorLogro;
	}

	/**
	 * @param usuariosPorLogro the usuariosPorLogro to set
	 */
	public void setUsuariosPorLogro(List<UsuarioLogro> usuariosPorLogro) {
		this.usuariosPorLogro = usuariosPorLogro;
	}

	public void addUsuarioLogro(UsuarioLogro usuarioLogro) {
		usuariosPorLogro.add(usuarioLogro);
	}

}
