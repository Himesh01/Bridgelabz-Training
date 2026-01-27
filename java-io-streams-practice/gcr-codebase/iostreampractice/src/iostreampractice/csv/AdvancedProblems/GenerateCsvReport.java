package iostreampractice.csv.AdvancedProblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.io.FileWriter;
import java.io.IOException;


public class GenerateCsvReport {
	public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "1234";

        String csvFile = "employee_report.csv";

        String query = "SELECT username, password FROM users";

        try (
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            FileWriter writer = new FileWriter(csvFile)
        ) {
            
            writer.append("username, password\n");

            
            while (rs.next()) {
                writer.append(rs.getString("username") + ",");
                writer.append(rs.getString("password"));
            }

            System.out.println("CSV report generated successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}