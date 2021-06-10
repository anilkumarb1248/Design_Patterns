package demos.dp.structural.facade;

import java.sql.Connection;

public interface ExcelReport {

	public void generateExcelReport(String tableName, Connection conn);
}
