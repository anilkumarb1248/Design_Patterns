package demos.dp.structural.facade;

import java.sql.Connection;

public interface HTMLReport {
	
	public void generateHTMLReport(String tableName, Connection conn);

}
