package control;

import java.sql.*;

public class manageUserListSystem {
	
	Statement stmt = null;
	Connection con = null;
	
	public manageUserListSystem() {   // 엑세스와 연결하는 메소드
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
	
	public int userdel(String roleId)
	{
		int deleteCount = 0;
		
		
		try {
			String sql = "delete from UserInfo123 where userName = ?";			
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, roleId);			
			deleteCount = ps.executeUpdate();	
			
		} catch(Exception e) {
			System.out.println("실패 > " + e.toString());
		}
			
		return deleteCount;
	}
	
	public int userupd(String _u, String _s, String _a, String _n, int _d)
	{
		int updateCount = 0;
		
		
		try {
			String sql = "UPDATE UserInfo123 SET UserName = ?, UserSex = ?, UserAge = ?, UserNumber = ?, daysRemaining = ? where UserName = ?";			
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, _u);			
			ps.setString(2, _s);			
			ps.setString(3, _a);			
			ps.setString(4, _n);			
			ps.setInt(5, _d);
			ps.setString(6, _u);
			updateCount = ps.executeUpdate();	
			
		} catch(Exception e) {
			System.out.println("실패 > " + e.toString());
		}
			
		return updateCount;
	}
}
