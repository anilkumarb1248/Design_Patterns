package demos.dp.creational.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		EmployeeRecord record = new EmployeeRecord(100, "Anil", 1000, "TA");
		System.out.println(record);

		EmployeeRecord record2 = record.clone();
		record2.setId(200);
		record2.setName("Kumar");
		System.out.println(record2);

		EmployeeRecord record3 = record.clone();
		record3.setId(300);
		record3.setName("Bandari");
		System.out.println(record3);
	}

}
