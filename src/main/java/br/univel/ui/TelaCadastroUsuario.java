package br.univel.ui;

import java.awt.BorderLayout;

/**
 * 
 * @author Jo�o Carlos Barbosa J�nior 10/11/2015 19:36:26
 *
 */

public class TelaCadastroUsuario extends MolduraAbstrata {

	public TelaCadastroUsuario() {
		super();
	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroUsuario(), BorderLayout.CENTER);
	}

}
