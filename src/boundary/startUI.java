package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;

// 회원 로그인
public class startUI {
	
	public startUI() {
		RoundedButton managerbtn = new RoundedButton("관리자 모드"); // 관리자 버튼
		RoundedButton regbtn = new RoundedButton("신규회원/전화번호로 시작"); // 회원가입 버튼
		RoundedButton loginbtn = new RoundedButton("기존회원/로그인"); // 로그인 버튼
		
		
		JLabel login = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		
		btnPanel.add(managerbtn); //관리자 버튼
		btnPanel.add(regbtn); //회원가입 버튼
		
		
		managerbtn.setSize(110,50);
		managerbtn.setLocation(400, 700);
		managerbtn.setBorderPainted(false); //관리자 버튼 테두리(외곽선) 없앰
		managerbtn.setFocusPainted(false); //관리자 버튼이 선택되었을 때 생기는 테두리 사용 안함
		managerbtn.setContentAreaFilled(false); //관리자 버튼 영역 채우지 않음
		frame.add(managerbtn); //관리자 버튼 출력
		
		regbtn.setSize(300, 100);
		regbtn.setLocation(300, 300);
		regbtn.setBorderPainted(false); //회원가입 버튼 테두리(외곽선) 없앰
		regbtn.setFocusPainted(false); //회원가입 버튼이 선택되었을 때 생기는 테두리 사용 안함
		regbtn.setContentAreaFilled(false); //회원가입 버튼 영역 채우지 않음
		frame.add(regbtn); //취소 버튼 출력
		
		loginbtn.setSize(300, 100);
		loginbtn.setLocation(300, 450);
		loginbtn.setBorderPainted(false); //로그인 버튼 테두리(외곽선) 없앰
		loginbtn.setFocusPainted(false); //로그인 버튼이 선택되었을 때 생기는 테두리 사용 안함
		loginbtn.setContentAreaFilled(false); //로그인 버튼 영역 채우지 않음
		frame.add(loginbtn); //로그인 버튼 출력
		
		
	
		login.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //로그인 라벨 글씨체, 굵기, 크기 설정
		login.setSize(1000,200); //로그인 라벨 크기 설정
		login.setLocation(330, 50); //로그인 라벨 위치 설정
		frame.add(login); //로그인 라벨 출력
		
		
		
		
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
				new memberLoginUI();
			}
		});
		

		
		managerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new managerModeUI();

				
			}
		});
		
		regbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 버튼
				frame.setVisible(false);
				new registerNewMemberUI();
			}
		});
	}
	public static void main(String[] args) {
		new startUI();
	}
	
}
