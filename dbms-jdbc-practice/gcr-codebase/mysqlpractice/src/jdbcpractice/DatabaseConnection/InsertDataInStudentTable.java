package jdbcpractice.DatabaseConnection;
import java.sql.*;

public class InsertDataInStudentTable {
	public static void insertStudent(String name, String email, int age, String grade) {
		
		String sql ="Tnsert into student(name , email, age, grade,enrollment_date) values(?,?,?,?,?)";
		
		try(Connection con =  DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4,grade);
			pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
			
			int rowAffected =pstmt.executeUpdate();
			System.out.println(rowAffected +"row(s) insetred successfully!");
		}
		catch(SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertStudent("Himesh", "himesh.kurmi@email.com", 20, "A");
		insertStudent("Rajeev", "rajeev.kurmi@email.com", 22, "B");
		}
}