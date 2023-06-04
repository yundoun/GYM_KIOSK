package boundary;

import javax.management.relation.Role;
import javax.swing.*;		
import java.sql.*;
import java.util.*;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import Btn_Design.RoundedButton;
import Btn_Design.RoundedButton4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// 회원 로그인
public class userListUI extends JFrame{
	String db_id = null;
	int row;
	Connection conn = null;
	Statement stmt = null;
	DefaultTableModel tableModel= null;
	
	public String Phonecheck(String num)
	{
		String pnum = num.substring(0,3)+"-"+num.substring(3,7)+"-"+num.substring(7,11);
		return pnum;
		
	}
	public String Dayscheck(String days) {
		int pdays = Integer.parseInt(days);
		int month = pdays / 30;
        int day = pdays % 30;
        String ppdays = month + "개월" + day + "일";
		return ppdays;
	}
	public userListUI() {
		String[] colName = { "이름", "성별", "나이", "전화번호", "남은이용권기간", "담당트레이너" }; //회원 정보를 나타낼 열 값
		tableModel = new DefaultTableModel(colName, 0);
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
			    
			    tableModel.addRow(data);
			    tableModel.fireTableDataChanged();
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		JTable userinfo = new JTable(tableModel); //테이블에 정보, 회원 정보를 나타낼 열 이름 넘겨줌
		JScrollPane scroll = new JScrollPane(userinfo); //스크롤테이블에 정보 넘겨줌
		
		userinfo.setRowHeight(30); //행 너비 조절
		userinfo.getTableHeader().setReorderingAllowed(false); //이동불가
		userinfo.getTableHeader().setResizingAllowed(false); //크기 조절 불가
		userinfo.getTableHeader().setBackground(Color.white); // 회원 정보 나타낼 행 배경 색 변경
		userinfo.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 20)); //회원정보 나타낼 행 글씨체, 굵기, 크기 변경
		userinfo.setFont(new Font("맑은 고딕", Font.BOLD, 15)); //회원정보 나타낼 행 글씨체, 굵기, 크기 변경
		userinfo.getParent().setBackground(Color.white); //테이블 배경 색 변경
		scroll.setBounds(20, 250, 850, 500); //테이블 위치, 크기 설정
		add(scroll); //프레임에 테이블 추가

		RoundedButton ScheduleCheckButton = new RoundedButton("출석/시간표 조회");

		JLabel Label1 = new JLabel("ZYM CARRY"); //타이틀 출력
		JLabel Label2 = new JLabel("회원목록"); //서브타이틀 출력

		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(scroll);

		ScheduleCheckButton.setSize(300,50);
		ScheduleCheckButton.setLocation(300, 830);
		ScheduleCheckButton.setBorderPainted(false); //테두리(외곽선) 없앰
		ScheduleCheckButton.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		ScheduleCheckButton.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(ScheduleCheckButton); 
			
		
		Label1.setOpaque(true);
		Label1.setBackground(Color.white);
		Label1.setFont(new Font("맑은 고딕", Font.BOLD, 40)); 
		Label1.setSize(450,80);
		Label1.setLocation(220, 50); 
		Label1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label1); 
		
		Label2.setOpaque(true);
		Label2.setBackground(Color.white);
		Label2.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label2.setSize(450,70); //로그인 라벨 크기 설정
		Label2.setLocation(220, 150); //로그인 라벨 위치 설정
		Label2.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label2); //로그인 라벨 출력
        
		
		
		frame.add(panel);

		
		
		setLayout(null);
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		setLocationRelativeTo(null); //창 모니터 가운데 정렬
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x를 누를 경우 종료
		getContentPane().setBackground(Color.WHITE); // 프레임 bg color
		
	}
	

}
