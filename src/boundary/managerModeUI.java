package boundary;

import java.awt.*;	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;

// 회원 로그인
public class managerModeUI {
	
	public managerModeUI() {
		RoundedButton one = new RoundedButton("1");
		RoundedButton two = new RoundedButton("2");
		RoundedButton three = new RoundedButton("3");
		RoundedButton four = new RoundedButton("4");
		RoundedButton five = new RoundedButton("5");
		RoundedButton six = new RoundedButton("6");
		RoundedButton seven = new RoundedButton("7");
		RoundedButton eight = new RoundedButton("8");
		RoundedButton nine = new RoundedButton("9");

		RoundedButton one2 = new RoundedButton("1");
		RoundedButton two2= new RoundedButton("2");
		RoundedButton three2 = new RoundedButton("3");
		RoundedButton four2 = new RoundedButton("4");
		RoundedButton five2 = new RoundedButton("5");
		RoundedButton six2 = new RoundedButton("6");
		RoundedButton seven2 = new RoundedButton("7");
		RoundedButton eight2 = new RoundedButton("8");
		RoundedButton nine2 = new RoundedButton("9");

		RoundedButton UserListButton = new RoundedButton("회원목록");
		RoundedButton SalesInquiryButton = new RoundedButton("매출조회");
		
		JLabel Label1 = new JLabel("ZYM CARRY"); //타이틀 출력

		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel menLockerUI = new JPanel(); //남자 락커 버튼 패널
		JPanel womenLockerUI = new JPanel(); //여자 락커 버튼 패널
		
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		menLockerUI.setOpaque(true);
		menLockerUI.setBackground(Color.WHITE);
		menLockerUI.setSize(300,300); //menLockerUI 크기
		menLockerUI.setLocation(90, 220);
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		womenLockerUI.setOpaque(true);
		womenLockerUI.setBackground(Color.WHITE);
		womenLockerUI.setSize(300,300); //menLockerUI 크기
		womenLockerUI.setLocation(90, 550);

		
		menLockerUI.add(one); 
		menLockerUI.add(two);
		menLockerUI.add(three);
		menLockerUI.add(four);
		menLockerUI.add(five);
		menLockerUI.add(six);
		menLockerUI.add(seven);
		menLockerUI.add(eight);
		menLockerUI.add(nine);

		womenLockerUI.add(one2); 
		womenLockerUI.add(two2);
		womenLockerUI.add(three2);
		womenLockerUI.add(four2);
		womenLockerUI.add(five2);
		womenLockerUI.add(six2);
		womenLockerUI.add(seven2);
		womenLockerUI.add(eight2);
		womenLockerUI.add(nine2);

		
		one.setSize(40,40);
		one.setLocation(100,250);
		one.setBorderPainted(false); //테두리(외곽선) 없앰
		one.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		one.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(one); 
		
		two.setSize(40,40);
		two.setLocation(200, 250);
		two.setBorderPainted(false); //테두리(외곽선) 없앰
		two.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		two.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(two); 
		
		three.setSize(40,40);
		three.setLocation(300, 250);
		three.setBorderPainted(false); //테두리(외곽선) 없앰
		three.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		three.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(three); 
		
		four.setSize(40,40);
		four.setLocation(100, 350);
		four.setBorderPainted(false); //테두리(외곽선) 없앰
		four.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		four.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(four); 
		
		five.setSize(40,40);
		five.setLocation(200, 350);
		five.setBorderPainted(false); //테두리(외곽선) 없앰
		five.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		five.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(five); 
		
		six.setSize(40,40);
		six.setLocation(300, 350);
		six.setBorderPainted(false); //테두리(외곽선) 없앰
		six.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		six.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(six); 
		
		seven.setSize(40,40);
		seven.setLocation(100, 450);
		seven.setBorderPainted(false); //테두리(외곽선) 없앰
		seven.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		seven.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(seven); 
		
		eight.setSize(40,40);
		eight.setLocation(200, 450);
		eight.setBorderPainted(false); //테두리(외곽선) 없앰
		eight.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		eight.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(eight); 

		nine.setSize(40,40);
		nine.setLocation(300, 450);
		nine.setBorderPainted(false); //테두리(외곽선) 없앰
		nine.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		nine.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(nine); 
		
		
		one2.setSize(40,40);
		one2.setLocation(100,600);
		one2.setBorderPainted(false); //테두리(외곽선) 없앰
		one2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		one2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(one2); 
		
		two2.setSize(40,40);
		two2.setLocation(200, 600);
		two2.setBorderPainted(false); //테두리(외곽선) 없앰
		two2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		two2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(two2); 
		
		three2.setSize(40,40);
		three2.setLocation(300, 600);
		three2.setBorderPainted(false); //테두리(외곽선) 없앰
		three2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		three2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(three2); 
		
		four2.setSize(40,40);
		four2.setLocation(100, 700);
		four2.setBorderPainted(false); //테두리(외곽선) 없앰
		four2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		four2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(four2); 
		
		five2.setSize(40,40);
		five2.setLocation(200, 700);
		five2.setBorderPainted(false); //테두리(외곽선) 없앰
		five2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		five2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(five2); 
		
		six2.setSize(40,40);
		six2.setLocation(300, 700);
		six2.setBorderPainted(false); //테두리(외곽선) 없앰
		six2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		six2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(six2); 
		
		seven2.setSize(40,40);
		seven2.setLocation(100, 800);
		seven2.setBorderPainted(false); //테두리(외곽선) 없앰
		seven2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		seven2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(seven2); 
		
		eight2.setSize(40,40);
		eight2.setLocation(200, 800);
		eight2.setBorderPainted(false); //테두리(외곽선) 없앰
		eight2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		eight2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(eight2); 

		nine2.setSize(40,40);
		nine2.setLocation(300, 800);
		nine2.setBorderPainted(false); //테두리(외곽선) 없앰
		nine2.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		nine2.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(nine2); 
		
		UserListButton.setSize(300,50);
		UserListButton.setLocation(500, 260);
		UserListButton.setBorderPainted(false); //테두리(외곽선) 없앰
		UserListButton.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		UserListButton.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(UserListButton); 

		SalesInquiryButton.setSize(300,50);
		SalesInquiryButton.setLocation(500, 360);
		SalesInquiryButton.setBorderPainted(false); //테두리(외곽선) 없앰
		SalesInquiryButton.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		SalesInquiryButton.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(SalesInquiryButton); 
			
		
		Label1.setOpaque(true);
		Label1.setBackground(Color.white);
		Label1.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label1.setSize(450,80); //로그인 라벨 크기 설정
		Label1.setLocation(220, 50); //로그인 라벨 위치 설정
		Label1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label1); //로그인 라벨 출력
		
 
        
		 
		frame.add(menLockerUI);
		frame.add(womenLockerUI);
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		

		UserListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new userListUI();

				
			}
		});
		
		SalesInquiryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				JOptionPane.showMessageDialog(null, "미구현 기능입니다.", "안내", JOptionPane.WARNING_MESSAGE);
				//트레이너 프로필 조회 버튼
			}
		});
	

		
	}
	

}