package br.univel.ui;

import java.awt.BorderLayout;

/**
 * 
 * @author João Carlos Barbosa Júnior 19/11/2015 19:28:27
 *
 */
public class TelaCadastroVenda extends MolduraAbstrata {

	public TelaCadastroVenda() {
		super();
	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroVenda(), BorderLayout.CENTER);
	}

}
