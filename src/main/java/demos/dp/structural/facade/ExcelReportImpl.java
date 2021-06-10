package demos.dp.structural.facade;

import java.sql.Connection;

public class ExcelReportImpl implements ExcelReport {

	@Override
	public void generateExcelReport(String tableName, Connection conn) {
		System.out.println("Excel report is generated");
	}

}
