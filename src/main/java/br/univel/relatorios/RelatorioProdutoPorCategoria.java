package br.univel.relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * 
 * @author Jo�o Carlos Barbosa J�nior 04/12/2015 22:39:37
 *
 */

public class RelatorioProdutoPorCategoria {

	private String url = "jdbc:postgresql://localhost:5432/SistemaVendas";
	private String user = "postgres";
	private String pass = "univel";

	private static final String OUT_PDF = "ClientesPorCidade.pdf";
	private String relatorio = "C:\\Users\\Junior\\git\\Trabalho4Bimestre\\src\\main\\java\\br\\univel\\relatorios\\ProdutoPorCategoria.jasper";

	/**
	 * met�do que vai gerar o relat�rio e exportar e abrir em PDF no
	 * visualizador padr�o da m�quina.
	 */

	public RelatorioProdutoPorCategoria() {
		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(relatorio, null,
					getConnection());

			JasperExportManager.exportReportToPdfFile(jasperPrint, OUT_PDF);

			Desktop.getDesktop().open(new File(OUT_PDF));

		} catch (JRException ex) {
			ex.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * m�todo vai abrir a conex�o para o relat�rio pegar os dados necess�rios
	 * para ser apresentado.
	 */
	private Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, pass);
		return con;
	}

}
