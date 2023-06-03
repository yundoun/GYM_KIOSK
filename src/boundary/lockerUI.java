package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;

// 회원 로그인
public class lockerUI {
	
	public lockerUI() {
		RoundedButton one = new RoundedButton("1");
		RoundedButton two = new RoundedButton("2");
		RoundedButton three = new RoundedButton("3");
		RoundedButton four = new RoundedButton("4");
		RoundedButton five = new RoundedButton("5");
		RoundedButton six = new RoundedButton("6");
		RoundedButton seven = new RoundedButton("7");
		RoundedButton eight = new RoundedButton("8");
		RoundedButton nine = new RoundedButton("9");
		JButton okButton = new JButton("확인");
		JButton cancelButton = new JButton("취소");
		
		
		JLabel titleLabel = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		JLabel guideLabel = new JLabel("락커 선택");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		btnPanel.setOpaque(true);
		btnPanel.setBackground(Color.WHITE);
		btnPanel.setSize(700,500); //로그인 라벨 크기 설정
		btnPanel.setLocation(100, 220);
		
		
		
		one.setSize(80,80);
		one.setLocation(200, 250);
		one.setBorderPainted(false); //테두리(외곽선) 없앰
		one.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		one.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(one); 
		
		two.setSize(80,80);
		two.setLocation(400, 250);
		two.setBorderPainted(false); //테두리(외곽선) 없앰
		two.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		two.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(two); 
		
		three.setSize(80,80);
		three.setLocation(600, 250);
		three.setBorderPainted(false); //테두리(외곽선) 없앰
		three.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		three.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(three); 
		
		four.setSize(80,80);
		four.setLocation(200, 400);
		four.setBorderPainted(false); //테두리(외곽선) 없앰
		four.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		four.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(four); 
		
		five.setSize(80,80);
		five.setLocation(400, 400);
		five.setBorderPainted(false); //테두리(외곽선) 없앰
		five.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		five.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(five); 
		
		six.setSize(80,80);
		six.setLocation(600, 400);
		six.setBorderPainted(false); //테두리(외곽선) 없앰
		six.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		six.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(six); 
		
		seven.setSize(80,80);
		seven.setLocation(200, 550);
		seven.setBorderPainted(false); //테두리(외곽선) 없앰
		seven.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		seven.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(seven); 
		
		eight.setSize(80,80);
		eight.setLocation(400, 550);
		eight.setBorderPainted(false); //테두리(외곽선) 없앰
		eight.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		eight.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(eight); 

		nine.setSize(80,80);
		nine.setLocation(600, 550);
		nine.setBorderPainted(false); //테두리(외곽선) 없앰
		nine.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		nine.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(nine); 
		
		okButton.setSize(150,40);
		okButton.setLocation(270, 670);
		okButton.setBorderPainted(false); //테두리(외곽선) 없앰
		okButton.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		okButton.setContentAreaFilled(true); // 영역 채우기 활성화
		okButton.setBackground(Color.orange);
		frame.add(okButton);
		
		cancelButton.setSize(150,40);
		cancelButton.setLocation(450, 670);
		cancelButton.setBorderPainted(false); //테두리(외곽선) 없앰
		cancelButton.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		cancelButton.setContentAreaFilled(true); // 영역 채우기 활성화
		cancelButton.setBackground(Color.orange);
		frame.add(cancelButton);
			
		
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Color.white);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(300,50); //로그인 라벨 크기 설정
		titleLabel.setLocation(300, 50); //로그인 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titleLabel); //로그인 라벨 출력
		
		guideLabel.setOpaque(true);
		guideLabel.setBackground(Color.white);
		guideLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		guideLabel.setSize(300,50); //로그인 라벨 크기 설정
		guideLabel.setLocation(300, 110); //로그인 라벨 위치 설정
		guideLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(guideLabel); //로그인 라벨 출력
	
		
		frame.add(btnPanel);
		frame.add(panel);
		
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new paymentUI();
			}
		});
		
		
		
		
		
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
				frame.dispose();
//				JOptionPane.showMessageDialog(null, "처음으로 돌아갑니다.", "안내", JOptionPane.WARNING_MESSAGE);
				new buyTicketUI();
			}
		});
		
	}
	
}