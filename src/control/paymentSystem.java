package control;

import java.sql.Connection;
import java.sql.Statement;

import entity.User;
import entity.userList;

public class paymentSystem {
	Statement stmt = null;
	Connection con = null;
	
	public paymentSystem() {   // 엑세스와 연결하는 메소드
		// TODO Auto-generated method stub
		User user = userList.curUser;
		}
}
