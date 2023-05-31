package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;

// 회원 로그인
public class lockerUI {
	
	public lockerUI() {
		RoundedButton won = new RoundedButton("1");
		RoundedButton two = new RoundedButton("2");
		RoundedButton three = new RoundedButton("3");
		RoundedButton four = new RoundedButton("4");
		RoundedButton five = new RoundedButton("5");
		RoundedButton six = new RoundedButton("6");
		RoundedButton seven = new RoundedButton("7");
		RoundedButton eight = new RoundedButton("8");
		RoundedButton nine = new RoundedButton("9");
		RoundedButton okbtn = new RoundedButton("확인");
		RoundedButton canclebtn = new RoundedButton("취소");
		
		
		
		JLabel Label1 = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		JLabel Label2 = new JLabel("락커 선택");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel backpanle = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		backpanle.setOpaque(true);
		backpanle.setBackground(Color.WHITE);
		backpanle.setSize(700,700); //로그인 라벨 크기 설정
		backpanle.setLocation(90, 220);
		
		
		btnPanel.add(won); 
		btnPanel.add(two);
		btnPanel.add(three);
		btnPanel.add(four);
		btnPanel.add(five);
		btnPanel.add(six);
		btnPanel.add(seven);
		btnPanel.add(eight);
		btnPanel.add(nine);
		btnPanel.add(okbtn);
		btnPanel.add(canclebtn);
		
		
		won.setSize(110,110);
		won.setLocation(180, 350);
		won.setBorderPainted(false); //테두리(외곽선) 없앰
		won.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		won.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(won); 
		
		two.setSize(110,110);
		two.setLocation(380, 350);
		two.setBorderPainted(false); //테두리(외곽선) 없앰
		two.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		two.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(two); 
		
		three.setSize(110,110);
		three.setLocation(580, 350);
		three.setBorderPainted(false); //테두리(외곽선) 없앰
		three.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		three.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(three); 
		
		four.setSize(110,110);
		four.setLocation(180, 500);
		four.setBorderPainted(false); //테두리(외곽선) 없앰
		four.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		four.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(four); 
		
		five.setSize(110,110);
		five.setLocation(380, 500);
		five.setBorderPainted(false); //테두리(외곽선) 없앰
		five.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		five.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(five); 
		
		six.setSize(110,110);
		six.setLocation(580, 500);
		six.setBorderPainted(false); //테두리(외곽선) 없앰
		six.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		six.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(six); 
		
		seven.setSize(110,110);
		seven.setLocation(180, 650);
		seven.setBorderPainted(false); //테두리(외곽선) 없앰
		seven.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		seven.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(seven); 
		
		eight.setSize(110,110);
		eight.setLocation(380, 650);
		eight.setBorderPainted(false); //테두리(외곽선) 없앰
		eight.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		eight.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(eight); 

		nine.setSize(110,110);
		nine.setLocation(580, 650);
		nine.setBorderPainted(false); //테두리(외곽선) 없앰
		nine.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		nine.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(nine); 
		
		okbtn.setSize(150,40);
		okbtn.setLocation(270, 800);
		okbtn.setBorderPainted(false); //테두리(외곽선) 없앰
		okbtn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		okbtn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(okbtn);
		
		canclebtn.setSize(150,40);
		canclebtn.setLocation(450, 800);
		canclebtn.setBorderPainted(false); //테두리(외곽선) 없앰
		canclebtn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		canclebtn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(canclebtn);
			
		
		Label1.setOpaque(true);
		Label1.setBackground(Color.white);
		Label1.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label1.setSize(450,80); //로그인 라벨 크기 설정
		Label1.setLocation(220, 50); //로그인 라벨 위치 설정
		Label1.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label1); //로그인 라벨 출력
		
		Label2.setOpaque(true);
		Label2.setBackground(Color.white);
		Label2.setFont(new Font("맑은 고딕", Font.BOLD, 32)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label2.setSize(450,80); //로그인 라벨 크기 설정
		Label2.setLocation(220, 150); //로그인 라벨 위치 설정
		Label2.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label2); //로그인 라벨 출력
	
		
		frame.add(backpanle);
		frame.add(panel);
		
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		won.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//로그인 버튼
						frame.setVisible(false);
					}
				});
		
		okbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		canclebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
	}
	
}