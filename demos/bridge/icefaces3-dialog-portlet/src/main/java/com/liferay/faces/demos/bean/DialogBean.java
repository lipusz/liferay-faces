package com.liferay.faces.demos.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * 
 * @author Tibor Lipusz
 * 
 * This portlet was created to demonstrate ace:dialog component in action
 * when the portlet is embedded into a custom theme.
 * 
 * Note! The current view has a very basic logic. It must be improved to use
 * in a production environment.
 * 
 * The project uses
 * {@link https://github.com/liferay/liferay-faces/tree/3.1.1-ga2}
 * as base source.
 * 
 * The complete source can be found at
 * https://github.com/lipusz/liferay-faces/tree/icefaces3-dialog-portlet-3.1.1-ga2}
 *
 */
@ManagedBean(name = "dialogBean")
@ViewScoped
public class DialogBean implements Serializable {

	private static final long serialVersionUID = -8202769823954371675L;

	private String firstName;
	private String lastName;

	public DialogBean() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
