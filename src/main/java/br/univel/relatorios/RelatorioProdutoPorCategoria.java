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
 * @author João Carlos Barbosa Júnior 04/12/2015 22:39:37
 *
 */

public class RelatorioProdutoPorCategoria {

	private String url = "jdbc:postgresql://localhost:5432/SistemaVendas";
	private String user = "postgres";
	private String pass = "univel";

	private static final String OUT_PDF = "ClientesPorCidade.pdf";
	private String relatorio = "C:\\Users\\Junior\\git\\Trabalho4Bimestre\\src\\main\\java\\br\\univel\\relatorios\\ProdutoPorCategoria.jasper";

	/**
	 * metódo que vai gerar o relatório e exportar e abrir em PDF no
	 * visualizador padrão da máquina.
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
	 * método vai abrir a conexão para o relatório pegar os dados necessários
	 * para ser apresentado.
	 */
	private Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(url, user, pass);
		return con;
	}

}
