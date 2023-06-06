package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginSystem {

	Statement stmt = null;
	Connection con = null;
	
	public void dbOpen() {   // 엑세스와 연결하는 메소드
		// TODO Auto-generated method stub
		String databaseURL = "jdbc:ucanaccess://Database1.accdb";

		
		try {
			con = DriverManager.getConnection(databaseURL);
			stmt = con.createStatement();
			
			System.out.print("Connect");
		}	catch(SQLException e) {
			e.printStackTrace();
			System.out.print("UnConnect");
		}
	}
	
	public void dbclose()
	{
	
		try {
			con.close();
			stmt.close();
			
		} catch(Exception e) {
			System.out.println("실패 > " + e.toString());
		}
			
	}
	
	public boolean logincheck(String _p) {
		boolean flag = false;
		
		String pw = _p;
		
		try {
			String checkingStr = "SELECT * FROM UserInfo123 WHERE UserNumber = '"+pw+"'";
			ResultSet result = stmt.executeQuery(checkingStr);

			int count = 0;
			while(result.next()) {
				if(pw.equals(result.getString("UserNumber"))) {
					flag = true;
					System.out.println("로그인 성공");
				}
				
				else {
					flag = false;
					System.out.println("로그인 실패");
				}
				count++;
			}
		} catch(Exception e) {
			flag = false;
			System.out.println("로그인 실패 > " + e.toString());
		}
		
		return flag;
	}
	
}
