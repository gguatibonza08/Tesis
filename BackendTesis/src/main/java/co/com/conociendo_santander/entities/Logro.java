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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "logros")
public class Logro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_logro")
	private Long idLogro;

	@Column(name = "nombre_logro")
	private String nombre;

	@Column(name = "descripcion_logro")
	private String descripcion;

	@Column(name = "insignia_logro")
	private String insignia;

	@Column(name = "estado_logro")
	private int estado;

	@OneToMany(mappedBy = "logro", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<LogroObjetivo> objetivosDelLogro;

	@OneToMany(mappedBy = "logro", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<UsuarioLogro> usuariosPorLogro;

	/**
	 * @param objetivosDelLogro
	 * @param usuariosPorLogro
	 */
	public Logro() {
		super();
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
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
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
