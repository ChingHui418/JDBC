package tw.hui.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Hui04 {
	private static final String URL = "jdbc:mysql://localhost:3306/iii";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String SQL_INSERT = """ 
			INSERT INTO cust
				(cname,tel,birthday)
			VALUES
				(?,?,?)
			""";
	
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWORD);
		
		try (Connection conn = DriverManager.getConnection(URL, prop);
				PreparedStatement pstmt = conn.prepareStatement(SQL_INSERT)
				){
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Name：");
			String cname = scanner.next();
			System.out.print("Tel：");
			String tel = scanner.next();
			System.out.print("Birthday：");
			String birthday = scanner.next();
			
			pstmt.setString(1, "Tont");
			pstmt.setString(2, "7777");
			pstmt.setString(3, "2001-03-04");
			
			int n = pstmt.executeUpdate();
			System.out.println(n);
			
		
		} catch (SQLException e) {
			System.out.println(e);
		}
      
	}

}
