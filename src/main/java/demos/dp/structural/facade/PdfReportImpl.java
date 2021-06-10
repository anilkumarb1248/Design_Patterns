package demos.dp.structural.facade;

import java.sql.Connection;

public class PdfReportImpl implements PdfReport {

	@Override
	public void generatePdfReport(String tableName, Connection conn) {
		System.out.println("PDF report is generated");
	}

}
