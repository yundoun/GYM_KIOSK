package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;

// 회원 로그인
public class buyTicketUI {
	
	public buyTicketUI() {
		RoundedButton mon1btn = new RoundedButton("1개월");
		RoundedButton mon3btn = new RoundedButton("3개월");
		RoundedButton mon6btn = new RoundedButton("6개월");
		RoundedButton mon12btn = new RoundedButton("12개월");
		RoundedButton no1btn = new RoundedButton("1회");
		RoundedButton no3btn = new RoundedButton("3회");
		RoundedButton no10btn = new RoundedButton("10회");
		RoundedButton no20btn = new RoundedButton("20회");
		
		
		
		JLabel titleLabel = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		JLabel guideLabel = new JLabel("이용권 선택");
		JLabel termTicketLabel = new JLabel("기간권");
		JLabel dayTicketLabel = new JLabel("일일권");
		JButton cancelButton = new JButton("취소");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		btnPanel.setOpaque(true);
		btnPanel.setBackground(Color.WHITE);
		btnPanel.setSize(600,500); //로그인 라벨 크기 설정
		btnPanel.setLocation(150, 200);
		
		

		
		
		mon1btn.setSize(150,40);
		mon1btn.setLocation(200, 300);
		mon1btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon1btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon1btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon1btn); 
		
		mon3btn.setSize(150,40);
		mon3btn.setLocation(400, 300);
		mon3btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon3btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon3btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon3btn); 
		
		mon6btn.setSize(150,40);
		mon6btn.setLocation(200, 360);
		mon6btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon6btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon6btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon6btn); 
		
		mon12btn.setSize(150,40);
		mon12btn.setLocation(400, 360);
		mon12btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon12btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon12btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon12btn); 
		
		no1btn.setSize(150,40);
		no1btn.setLocation(200, 550);
		no1btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no1btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no1btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no1btn); 
		
		no3btn.setSize(150,40);
		no3btn.setLocation(400, 550);
		no3btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no3btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no3btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no3btn); 
		
		no10btn.setSize(150,40);
		no10btn.setLocation(200, 610);
		no10btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no10btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no10btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no10btn); 
		
		no20btn.setSize(150,40);
		no20btn.setLocation(400, 610);
		no20btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no20btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no20btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no20btn); 
		
		cancelButton.setOpaque(true);
		cancelButton.setSize(100, 50);
		cancelButton.setLocation(630, 630);
		cancelButton.setFont(new Font("맑은 고딕", Font.BOLD, 15)); 
		cancelButton.setBackground(Color.orange);
		frame.add(cancelButton); 
		
		titleLabel.setOpaque(true);
		titleLabel.setBackground(Color.white);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //로그인 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(300,50); //로그인 라벨 크기 설정
		titleLabel.setLocation(330, 50); //로그인 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(titleLabel); //로그인 라벨 출력
		
		guideLabel.setOpaque(true);
		guideLabel.setBackground(Color.white);
		guideLabel.setFont(new Font("맑은 고딕", Font.BOLD, 32)); //로그인 라벨 글씨체, 굵기, 크기 설정
		guideLabel.setSize(300,50); //로그인 라벨 크기 설정
		guideLabel.setLocation(330, 110); //로그인 라벨 위치 설정
		guideLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(guideLabel); //로그인 라벨 출력
		
		termTicketLabel.setOpaque(true);
		termTicketLabel.setBackground(Color.CYAN);
		termTicketLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		termTicketLabel.setSize(150,40); //로그인 라벨 크기 설정
		termTicketLabel.setLocation(200, 250); //로그인 라벨 위치 설정
		termTicketLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(termTicketLabel); //로그인 라벨 출력
		
		dayTicketLabel.setOpaque(true);
		dayTicketLabel.setBackground(Color.CYAN);
		dayTicketLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		dayTicketLabel.setSize(150,40); //로그인 라벨 크기 설정
		dayTicketLabel.setLocation(200, 500); //로그인 라벨 위치 설정
		dayTicketLabel.setHorizontalAlignment(JLabel.CENTER);
		frame.add(dayTicketLabel); //로그인 라벨 출력
		
		
		
		frame.add(btnPanel);
		frame.add(panel);
		
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		mon1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		mon3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		mon6btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		mon12btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		no1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();	
			}
		});
		
		no3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
				
			}
		});
		
		no10btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		no20btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new lockerUI();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new mainUI();
			}
		});
		
	}
}