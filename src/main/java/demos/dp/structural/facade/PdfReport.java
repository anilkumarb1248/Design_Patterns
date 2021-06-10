package demos.dp.structural.facade;

import java.sql.Connection;

public interface PdfReport {
	
	public void generatePdfReport(String tableName, Connection conn);

}
