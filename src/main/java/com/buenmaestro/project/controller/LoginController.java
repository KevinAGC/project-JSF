/**
 * 
 */
package com.buenmaestro.project.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Kevin Clase que nos permite en funcionamiento de la pantalla con el
 *         login.xhtml
 */

@ManagedBean
public class LoginController {

	private String usuario;
	private String password;

	public void ingresar() {
		System.out.println("Usuario " + usuario);
		// facescontext es una clase del API de JSF
		if (usuario.equals("depredador") && password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}

			/*
			 * FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario", new
			 * FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));
			 */
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}

	/**
	 * @return the usuario
	 */

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
