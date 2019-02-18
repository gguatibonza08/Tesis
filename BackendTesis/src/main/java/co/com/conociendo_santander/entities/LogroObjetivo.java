package co.com.conociendo_santander.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author gian
 *
 */
@Entity
@Table(name = "logros_objetivos")
public class LogroObjetivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_logro_objetivo")
	private Long idLogroObjetivo;

	@Column(name = "estado")
	private int estado;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_logro")
	private Logro logro;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_objetivo")
	private Objetivo objetivo;

	/**
	 * @return the idLogroObjetivo
	 */
	public Long getIdLogroObjetivo() {
		return idLogroObjetivo;
	}

	/**
	 * @param idLogroObjetivo the idLogroObjetivo to set
	 */
	public void setIdLogroObjetivo(Long idLogroObjetivo) {
		this.idLogroObjetivo = idLogroObjetivo;
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
	 * @return the logro
	 */
	public Logro getLogro() {
		return logro;
	}

	/**
	 * @param logro the logro to set
	 */
	public void setLogro(Logro logro) {
		this.logro = logro;
	}

	/**
	 * @return the objetivo
	 */
	public Objetivo getObjetivo() {
		return objetivo;
	}

	/**
	 * @param objetivo the objetivo to set
	 */
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

}
