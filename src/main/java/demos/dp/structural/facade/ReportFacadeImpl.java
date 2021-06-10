package demos.dp.structural.facade;

import java.sql.Connection;

public class ReportFacadeImpl implements ReportFacade {

	private PdfReport pdfReport;
	private ExcelReport excelReport;
	private HTMLReport htmlReport;

	public ReportFacadeImpl() {
		pdfReport = new PdfReportImpl();
		excelReport = new ExcelReportImpl();
		htmlReport = new HTMLReportImpl();
	}

	@Override
	public void generatePdfReport(String tableName, Connection conn) {
		pdfReport.generatePdfReport(tableName, conn);
	}

	@Override
	public void generateExcelReport(String tableName, Connection conn) {
		excelReport.generateExcelReport(tableName, conn);
	}

	@Override
	public void generateHTMLReport(String tableName, Connection conn) {
		htmlReport.generateHTMLReport(tableName, conn);
	}

}
