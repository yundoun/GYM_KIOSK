package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.swing.table.DefaultTableModel;

public class userList {
	public static User curUser;
	List<User> UserList = new ArrayList<User>();
	DefaultTableModel tableModel= null;

	public String Phonecheck(String num)
	{
		String pnum = num.substring(0,3)+"-"+num.substring(3,7)+"-"+num.substring(7,11);
		return pnum;
		
	}
	public String Dayscheck(String days) {
	      if(days != null) {
	         int pdays = Integer.parseInt(days);
	         int month = pdays / 30;
	         int day = pdays % 30;
	         String ppdays = month + "개월" + day + "일";
	         return ppdays;
	      }
	      else {
	         String ppdays = "-";
	         return ppdays;
	      }
	   }
	
	public userList() {
		
		String databaseURL = "jdbc:ucanaccess://Database1.accdb";
		try
		{
			Connection con=DriverManager.getConnection(databaseURL);
			Statement stmt = null;
			ResultSet rs = null;
			
			stmt = con.createStatement(); //쿼리 준비 단계
	        String selectSql = "SELECT UserName, UserSex, UserAge, UserNumber, daysRemaining, consultationInfo FROM UserInfo123"; //전송할 쿼리문
	        stmt.executeQuery(selectSql); //쿼리문 전송
	        
			rs = stmt.executeQuery(selectSql);
			while (rs.next()) {
			    // create a single array of one row's worth of data
			    String[] data = { rs.getString("UserName"), rs.getString("UserSex"), rs.getString("UserAge"),
			    		Phonecheck(rs.getString("UserNumber")), Dayscheck(rs.getString("daysRemaining")), rs.getString("consultationInfo") };
			    
			    //User users = new User(rs.getString("UserName"), rs.getString("UserSex"), rs.getString("UserAge"),
			    	//	Phonecheck(rs.getString("UserNumber")), Dayscheck(rs.getString("daysRemaining")), rs.getString("consultationInfo"));
			    
			    //UserList.add(users);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int user_day(int day, String _u)
	{
		String databaseURL = "jdbc:ucanaccess://Database1.accdb";
		int dayCount = 0;
		
		try {
			Connection con=DriverManager.getConnection(databaseURL);
			String sql = "UPDATE UserInfo123 SET daysRemaining = daysRemaining + ? WHERE UserName = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, day);
			ps.setString(2, _u);
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("실패 > " + e.toString());
		}
		return dayCount;
		
	}
	
	public List<User> getUserList() {
		return this.UserList;
	}
	public void addUser(User user) {
		UserList.add(user);
	}
	public boolean delUser(User user) {
		
		for(int i=0;i<UserList.size();i++) {
			if(UserList.get(i).getName() == user.getName()) {
				UserList.remove(i);
				return true;
			}
		}
		return false;

	}
	public boolean searchUserInformation(String num) {
		return true;
		// 미구현 부분
	}
}
