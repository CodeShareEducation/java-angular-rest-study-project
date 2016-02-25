package br.com.codeshare.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "user", nullable = false, length = 50)
	private String usuario;

	@Column(name = "password", nullable = false, length = 150)
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
