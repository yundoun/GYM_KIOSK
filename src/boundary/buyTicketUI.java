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
		
		
		
		JLabel Label1 = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		JLabel Label2 = new JLabel("이용권 선택");
		JLabel Label3 = new JLabel("기간권");
		JLabel Label4 = new JLabel("일일권");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel backpanle = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		backpanle.setOpaque(true);
		backpanle.setBackground(Color.WHITE);
		backpanle.setSize(700,630); //로그인 라벨 크기 설정
		backpanle.setLocation(90, 280);
		
		
		btnPanel.add(mon1btn); 
		btnPanel.add(mon3btn);
		btnPanel.add(mon6btn);
		btnPanel.add(mon12btn);
		btnPanel.add(no1btn);
		btnPanel.add(no3btn);
		btnPanel.add(no10btn);
		btnPanel.add(no20btn);
		
		
		mon1btn.setSize(150,40);
		mon1btn.setLocation(150, 400);
		mon1btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon1btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon1btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon1btn); 
		
		mon3btn.setSize(150,40);
		mon3btn.setLocation(350, 400);
		mon3btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon3btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon3btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon3btn); 
		
		mon6btn.setSize(150,40);
		mon6btn.setLocation(150, 460);
		mon6btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon6btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon6btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon6btn); 
		
		mon12btn.setSize(150,40);
		mon12btn.setLocation(350, 460);
		mon12btn.setBorderPainted(false); //테두리(외곽선) 없앰
		mon12btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		mon12btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(mon12btn); 
		
		no1btn.setSize(150,40);
		no1btn.setLocation(150, 650);
		no1btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no1btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no1btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no1btn); 
		
		no3btn.setSize(150,40);
		no3btn.setLocation(350, 650);
		no3btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no3btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no3btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no3btn); 
		
		no10btn.setSize(150,40);
		no10btn.setLocation(150, 710);
		no10btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no10btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no10btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no10btn); 
		
		no20btn.setSize(150,40);
		no20btn.setLocation(350, 710);
		no20btn.setBorderPainted(false); //테두리(외곽선) 없앰
		no20btn.setFocusPainted(false); //이 선택되었을 때 생기는 테두리 사용 안함
		no20btn.setContentAreaFilled(false); //영역 채우지 않음
		frame.add(no20btn); 
			
		
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
		
		Label3.setOpaque(true);
		Label3.setBackground(Color.CYAN);
		Label3.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label3.setSize(150,40); //로그인 라벨 크기 설정
		Label3.setLocation(150, 350); //로그인 라벨 위치 설정
		Label3.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label3); //로그인 라벨 출력
		
		Label4.setOpaque(true);
		Label4.setBackground(Color.CYAN);
		Label4.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //로그인 라벨 글씨체, 굵기, 크기 설정
		Label4.setSize(150,40); //로그인 라벨 크기 설정
		Label4.setLocation(150, 600); //로그인 라벨 위치 설정
		Label4.setHorizontalAlignment(JLabel.CENTER);
		frame.add(Label4); //로그인 라벨 출력
		
		
		
		frame.add(backpanle);
		frame.add(panel);
		
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		mon1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		mon3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		mon6btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		mon12btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		no1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		no3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		no10btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
		
		no20btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
			}
		});
	}
}