package br.univel.util;

/**
 * 
 * @author João Carlos Barbosa Júnior 10/11/2015 19:28:16
 *
 */

public class Usuario extends Cliente {

	private int idUsuario;
	private String senha;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
