package jdbcpractice.DatabaseConnection;
import java.sql.*;

public class RemoveDataFromStudent {

	public static void deleteStudent(int stuId) {
		
		String sql = "delete from student where id = ?";
		
		try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,stuId);
			
			int rowsAffected = pstmt.executeUpdate();
			
			System.out.println(rowsAffected+" row(s) affected");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static boolean deleteStudentSafe(int stuId) {
		String checkSql = "Select count(*) from student where id=?";
		String deleteSql = "Delete from student where id=?";
		
		try(Connection con = DatabaseConnection.getConnection();){
			try(PreparedStatement checkStmt = con.prepareStatement(checkSql)){
				checkStmt.setInt(1, stuId);
				ResultSet rs =checkStmt.executeQuery();
				rs.next();
				if(rs.getInt(1)==0) {
					System.out.println("Student not found");
					return false;
				}
			}
			try (PreparedStatement deleteStmt = con.prepareStatement(deleteSql)) {
				deleteStmt.setInt(1, stuId);
				deleteStmt.executeUpdate();
				System.out.println("Student deleted successfully!");
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public static void main(String[] args) {
		deleteStudentSafe(2);
	}
}