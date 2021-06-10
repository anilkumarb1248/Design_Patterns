package demos.dp.structural.facade;

import java.sql.Connection;

public interface ReportFacade {

	public void generatePdfReport(String tableName, Connection conn);

	public void generateExcelReport(String tableName, Connection conn);

	public void generateHTMLReport(String tableName, Connection conn);

}
