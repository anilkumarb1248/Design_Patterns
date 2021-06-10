package demos.dp.structural.facade;

import java.sql.Connection;

public class ClientTest {

	public static void main(String[] args) {

		Connection conn = null;
		String tableName = "employee";

		// Without using Facade Pattern
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport(tableName, conn);

		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(tableName, conn);

		HTMLReport htmlReport = new HTMLReportImpl();
		htmlReport.generateHTMLReport(tableName, conn);

		// With using Facade Pattern
		
		ReportFacade reportFacade = new ReportFacadeImpl();
		reportFacade.generatePdfReport(tableName, conn);
		reportFacade.generateExcelReport(tableName, conn);
		reportFacade.generateHTMLReport(tableName, conn);
		

	}

}
