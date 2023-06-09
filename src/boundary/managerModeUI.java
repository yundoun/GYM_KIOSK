package boundary;

import java.awt.*;	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


// 회원 로그인
public class managerModeUI {
	
	public managerModeUI() {
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");

		JButton one2 = new JButton("1");
		JButton two2= new JButton("2");
		JButton three2 = new JButton("3");
		JButton four2 = new JButton("4");
		JButton five2 = new JButton("5");
		JButton six2 = new JButton("6");
		JButton seven2 = new JButton("7");
		JButton eight2 = new JButton("8");
		JButton nine2 = new JButton("9");

		JButton UserListButton = new JButton("회원목록");
		JButton SalesInquiryButton = new JButton("매출조회");
		
		JLabel Label1 = new JLabel("ZYM CARRY"); //타이틀 출력

		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel menLockerUI = new JPanel(); //남자 락커 버튼 패널
		JPanel womenLockerUI = new JPanel(); //여자 락커 버튼 패널
		
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		menLockerUI.setOpaque(true);
		menLockerUI.setBackground(Color.WHITE);
		menLockerUI.setSize(300,280); //menLockerUI 크기
		menLockerUI.setLocation(90, 150);
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		womenLockerUI.setOpaque(true);
		womenLockerUI.setBackground(Color.WHITE);
		womenLockerUI.setSize(300,280); //menLockerUI 크기
		womenLockerUI.setLocation(90, 470);

		
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
		one.setLocation(100,180);
		one.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		one.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		one.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		one.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		one.setBackground(Color.LIGHT_GRAY);
		frame.add(one); 
		
		two.setSize(40,40);
		two.setLocation(200, 180);
		two.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		two.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		two.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		two.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		two.setBackground(Color.LIGHT_GRAY);
		frame.add(two); 
		
		three.setSize(40,40);
		three.setLocation(300, 180);
		three.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		three.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		three.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		three.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		three.setBackground(Color.LIGHT_GRAY);
		frame.add(three); 
		
		four.setSize(40,40);
		four.setLocation(100, 280);
		four.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		four.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		four.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		four.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		four.setBackground(Color.LIGHT_GRAY);
		frame.add(four); 
		
		five.setSize(40,40);
		five.setLocation(200, 280);
		five.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		five.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		five.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		five.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		five.setBackground(Color.LIGHT_GRAY);
		frame.add(five); 
		
		six.setSize(40,40);
		six.setLocation(300, 280);
		six.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		six.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		six.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		six.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		six.setBackground(Color.LIGHT_GRAY);
		frame.add(six); 
		
		seven.setSize(40,40);
		seven.setLocation(100, 380);
		seven.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		seven.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		seven.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		seven.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		seven.setBackground(Color.LIGHT_GRAY);
		frame.add(seven); 
		
		eight.setSize(40,40);
		eight.setLocation(200, 380);
		eight.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		eight.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		eight.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		eight.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		eight.setBackground(Color.LIGHT_GRAY);
		frame.add(eight); 

		nine.setSize(40,40);
		nine.setLocation(300, 380);
		nine.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		nine.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		nine.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		nine.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		nine.setBackground(Color.LIGHT_GRAY);
		frame.add(nine); 
		
		
		one2.setSize(40,40);
		one2.setLocation(100,500);
		one2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		one2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		one2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		one2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		one2.setBackground(Color.LIGHT_GRAY);
		frame.add(one2); 
		
		two2.setSize(40,40);
		two2.setLocation(200, 500);
		two2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		two2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		two2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		two2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		two2.setBackground(Color.LIGHT_GRAY);
		frame.add(two2); 
		
		three2.setSize(40,40);
		three2.setLocation(300, 500);
		three2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		three2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		three2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		three2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		three2.setBackground(Color.LIGHT_GRAY);
		frame.add(three2); 
		
		four2.setSize(40,40);
		four2.setLocation(100, 600);
		four2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		four2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		four2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		four2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		four2.setBackground(Color.LIGHT_GRAY);
		frame.add(four2); 
		
		five2.setSize(40,40);
		five2.setLocation(200, 600);
		five2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		five2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		five2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		five2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		five2.setBackground(Color.LIGHT_GRAY);
		frame.add(five2); 
		
		six2.setSize(40,40);
		six2.setLocation(300, 600);
		six2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		six2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		six2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		six2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		six2.setBackground(Color.LIGHT_GRAY);
		frame.add(six2); 
		
		seven2.setSize(40,40);
		seven2.setLocation(100, 700);
		seven2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		seven2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		seven2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		seven2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		seven2.setBackground(Color.LIGHT_GRAY);
		frame.add(seven2); 
		
		eight2.setSize(40,40);
		eight2.setLocation(200, 700);
		eight2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		eight2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		eight2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		eight2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		eight2.setBackground(Color.LIGHT_GRAY);
		frame.add(eight2); 

		nine2.setSize(40,40);
		nine2.setLocation(300, 700);
		nine2.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		nine2.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		nine2.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		nine2.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		nine2.setBackground(Color.LIGHT_GRAY);
		frame.add(nine2); 
		
		UserListButton.setSize(300,50);
		UserListButton.setLocation(500, 260);
		UserListButton.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		UserListButton.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		UserListButton.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		UserListButton.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		UserListButton.setBackground(Color.white);
		frame.add(UserListButton); 

		SalesInquiryButton.setSize(300,50);
		SalesInquiryButton.setLocation(500, 360);
		SalesInquiryButton.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		SalesInquiryButton.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		SalesInquiryButton.setContentAreaFilled(true); //관리자 버튼 영역 채우기
		SalesInquiryButton.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		SalesInquiryButton.setBackground(Color.white);
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