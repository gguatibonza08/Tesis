package co.com.conociendo_santander.util.responses;

import java.io.Serializable;

import co.com.conociendo_santander.entities.Usuario;

public class LoginRespuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int code;
	private String mensaje;
	private Usuario user;

	/**
	 * 
	 */
	public LoginRespuesta() {
		super();
	}

	/**
	 * @param code
	 * @param mensaje
	 * @param user
	 */
	public LoginRespuesta(int code, String mensaje, Usuario user) {
		super();
		this.code = code;
		this.mensaje = mensaje;
		this.user = user;
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

	/**
	 * @return the user
	 */
	public Usuario getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Usuario user) {
		this.user = user;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
