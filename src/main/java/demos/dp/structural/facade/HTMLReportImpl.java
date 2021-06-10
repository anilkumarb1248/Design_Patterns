package demos.dp.structural.facade;

import java.sql.Connection;

public class HTMLReportImpl implements HTMLReport {

	@Override
	public void generateHTMLReport(String tableName, Connection conn) {
		System.out.println("HTML report is generated");
	}

}
