package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

/**
 * 
 * @author gian
 *
 */
public class MunicipioSimple implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idMunicipio;	
	private String nombre;
	private String foto;
	private String basica;
	/**
	 * @param idMunicipio
	 * @param nombre
	 * @param foto
	 * @param basica
	 */
	public MunicipioSimple(Long idMunicipio, String nombre, String foto, String basica) {
		super();
		this.idMunicipio = idMunicipio;
		this.nombre = nombre;
		this.foto = foto;
		this.basica = basica;
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
	
	
	
	
	
}
