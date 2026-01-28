package iostreampractice.JSON.AdvancedProblem;


import com.google.gson.*;
import java.sql.*;

public class JsonReport {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "password");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees");

        JsonArray arr = new JsonArray();

        while (rs.next()) {
            JsonObject obj = new JsonObject();
            obj.addProperty("id", rs.getInt("id"));
            obj.addProperty("name", rs.getString("name"));
            obj.addProperty("department", rs.getString("department"));
            obj.addProperty("salary", rs.getDouble("salary"));
            arr.add(obj);
        }

        System.out.println(arr);
        con.close();
    }
}
