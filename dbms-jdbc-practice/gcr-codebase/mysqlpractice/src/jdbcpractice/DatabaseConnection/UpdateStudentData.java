package jdbcpractice.DatabaseConnection;

import java.util.*;
import java.sql.*;

public class UpdateStudentData {

	public static void updateStudentGrade(int studentId, String newGrade) {
		
		String sql = "Update student set grade= ? where id= ?";
		
		try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1,newGrade);
			pstmt.setInt(2, studentId);
			
			int rowAffected = pstmt.executeUpdate();
			
			if (rowAffected > 0) {
				System.out.println("Grade updated successfully!");
				} else {
				System.out.println("Student not found!");
				}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void updateStudentInfo(int id, String name, String email, int age) {
		
		String sql = "Update student set name=?, email=?, age=? where id=?";
		
		try(Connection con = DatabaseConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setInt(4, id);
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected+" row(s) updated!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		updateStudentGrade(1, "A+");
		updateStudentInfo(2, "Lucky Pal upadated", "lucky.pal@email.com", 23);
	}
}