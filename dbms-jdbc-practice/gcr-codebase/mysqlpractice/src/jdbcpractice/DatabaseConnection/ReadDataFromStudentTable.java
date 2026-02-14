package jdbcpractice.DatabaseConnection;

import java.sql.*;

public class ReadDataFromStudentTable {
	public static void getAllStudents() {
		
		String sql = "Select * from student";
		
		try(Connection con = DatabaseConnection.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			
			System.out.println("ID\tName\t\tEmail\t\t\tAge\tGrade");
			System.out.println("--------------------------------------------");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");
				
				System.out.printf("%d\t%s\t%s\t%d\t%s%n",
						id, name, email, age, grade);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getAllStudents();
		System.out.println("\n");
		
		}
}