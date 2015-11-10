package br.univel.ui;

import java.awt.BorderLayout;

/**
 * 
 * @author João Carlos Barbosa Júnior 10/11/2015 19:36:26
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
