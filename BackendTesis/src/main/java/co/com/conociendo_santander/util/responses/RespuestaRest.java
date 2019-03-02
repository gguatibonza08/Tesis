/**
 * 
 */
package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

/**
 * @author gian
 *
 */
public class RespuestaRest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int code;
	private String mensaje;

	/**
	 * @param code
	 * @param mensaje
	 */
	public RespuestaRest(int code, String mensaje) {
		super();
		this.code = code;
		this.mensaje = mensaje;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
