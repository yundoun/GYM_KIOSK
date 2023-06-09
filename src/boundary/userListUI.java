package boundary;

import javax.management.relation.Role;
import javax.swing.*;		
import java.sql.*;
import java.util.*;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import control.manageUserListSystem;


// 회원 로그인
public class userListUI extends JFrame{
	manageUserListSystem db = new manageUserListSystem();
	String db_name = null;
	String db_sex = null;
	String db_age = null;
	String db_num = null;
	String db_day = null;
	int db_day1 = 0;
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
	      if(days != null) {
	         int pdays = Integer.parseInt(days);
	         String pdays1 = pdays + "일";
	         return pdays1;
	      }
	      else {
	         String ppdays = "-";
	         return ppdays;
	      }
	   }
	
	public void showDialog(String s1, String s2, int opt ) {
	      if(opt == 1)
	         JOptionPane.showMessageDialog(null, s1, s2, JOptionPane.ERROR_MESSAGE);
	      else
	         JOptionPane.showMessageDialog(null, s1);
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

		JButton del_btn = new JButton("회원삭제");
		JButton upd_btn = new JButton("회원수정");
		JButton home_btn = new JButton("처음으로");

		JLabel Label1 = new JLabel("ZYM CARRY"); //타이틀 출력
		JLabel Label2 = new JLabel("회원목록"); //서브타이틀 출력
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(scroll);

		home_btn.setSize(100,30);
		home_btn.setLocation(50, 90);
		home_btn.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		home_btn.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		home_btn.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		home_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		home_btn.setBackground(Color.LIGHT_GRAY);
		frame.add(home_btn); 
		
		del_btn.setSize(100,30);
		del_btn.setLocation(50, 140);
		del_btn.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		del_btn.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		del_btn.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		del_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		del_btn.setBackground(Color.LIGHT_GRAY);
		frame.add(del_btn); 
		
		upd_btn.setSize(100,30);
		upd_btn.setLocation(50, 190);
		upd_btn.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		upd_btn.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		upd_btn.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		upd_btn.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		upd_btn.setBackground(Color.LIGHT_GRAY);
		frame.add(upd_btn); 
			
		
		Label1.setOpaque(true);
		Label1.setBackground(Color.white);
		Label1.setFont(new Font("맑은 고딕", Font.BOLD, 20)); 
		Label1.setSize(450,80);
		Label1.setLocation(220, 50); 
		Label1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label1); 
		
		Label2.setOpaque(true);
		Label2.setBackground(Color.white);
		Label2.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label2.setSize(450,70); //로그인 라벨 크기 설정
		Label2.setLocation(220, 150); //로그인 라벨 위치 설정
		Label2.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label2); //로그인 라벨 출력
        
		
		
		frame.add(panel);

		
		
		setLayout(null);
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		getContentPane().setBackground(Color.WHITE); // 프레임 bg color
		
		userinfo.addMouseListener(new MouseAdapter() {

//			마우스 클릭시 처리를 담당하는 메소드 재정의
			@Override
			public void mouseClicked(MouseEvent e) {
				row = userinfo.getSelectedRow();
				int col = userinfo.getSelectedColumn();
				db_name = (String) userinfo.getModel().getValueAt(row, 0);
				db_sex = (String) userinfo.getModel().getValueAt(row, 1);
				db_age = (String) userinfo.getModel().getValueAt(row, 2);
				db_num = (String) userinfo.getModel().getValueAt(row, 3);
				db_num = db_num.replace("-", "");
				db_day = (String) userinfo.getModel().getValueAt(row, 4);
				db_day = db_day.replace("일", "");
				db_day1 = Integer.parseInt(db_day);
			}
		});
		
		home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
				new startUI();
			}
		});
		
		del_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "ID : " + db_name + "회원을 삭제 하시겠습니까?", "회원 삭제", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (reply == JOptionPane.YES_OPTION)
				{
					int deleteCount = db.userdel(db_name);
					//List<Role> list = db.getRoles();
					System.out.println(deleteCount);
					tableModel.removeRow(row); 
					showDialog("삭제가 완료되었습니다 ! ", "삭제성공", 0);
				}
				
				else
				{
					showDialog("삭제를 취소했습니다.", "회원 삭제 취소", 0);
				}
					
			}
		});
		
		upd_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null, "ID : " + db_name + "회원의 정보를 수정 하시겠습니까?", "회원 정보 수정", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (reply == JOptionPane.YES_OPTION)
				{
					int updateCount = db.userupd(db_name, db_sex, db_age, db_num, db_day1);
					//List<Role> list = db.getRoles();
					System.out.println(updateCount);
					tableModel.fireTableRowsUpdated(row, 0);
					showDialog("수정을 완료했습니다..", "회원 정보 수정 완료", 0);
				}
				
				else
				{
					showDialog("수정을 취소했습니다.", "회원 정보 수정 취소", 0);
				}
					
			}
		});
		
	}
	
	

}
