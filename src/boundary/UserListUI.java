package boundary;

import java.awt.*;	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Btn_Design.*;


// 회원 로그인
public class UserListUI  {
	
	public UserListUI() {

		RoundedButton ScheduleCheckButton = new RoundedButton("출석/시간표 조회");

		JLabel Label1 = new JLabel("ZYM CARRY"); //타이틀 출력
		JLabel Label2 = new JLabel("회원목록"); //서브타이틀 출력

		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();


		


		ScheduleCheckButton.setSize(300,50);
		ScheduleCheckButton.setLocation(300, 700);
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
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		
	

		
	}
	
}
