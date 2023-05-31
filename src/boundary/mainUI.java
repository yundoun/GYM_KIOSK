package boundary;
import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Btn_Design.*;

// 회원 로그인
public class mainUI {
	

	public mainUI() {
		
		String UserName = null;
		
		JLabel titleLabel = new JLabel("ZYM CARRY");
		JPanel guidePanel = new JPanel();
		
		JLabel label1 = new JLabel(UserName+" 회원님, 반갑습니다 !");
		JLabel label2 = new JLabel("이용하실 서비스를 선택하세요.");
		
		RoundedButton trainerProfileButton = new RoundedButton("트레이너 프로필 조회");
		RoundedButton buyTicketButton = new RoundedButton("이용권 구매");
		RoundedButton ptConsultantResevationButton = new RoundedButton("PT 상담 예약");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN);
		
		titleLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //제목 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(800,100); //제목 라벨 크기 설정
		titleLabel.setLocation(30, 50); //제목 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		frame.add(titleLabel); //제목 라벨 출력
		
		guidePanel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		guidePanel.setBackground(Color.WHITE);
		guidePanel.setSize(800, 300);
		guidePanel.setLocation(30,200);
		frame.add(guidePanel);
		
		// 여백 레이블
		JLabel space1 = new JLabel("                                                     ");
		space1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		JLabel space2 = new JLabel("                                                     ");
		space2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		JLabel space3 = new JLabel("                                                     ");
		space3.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		label1.setFont(new Font("맑은 고딕", Font.BOLD, 30));	
		label2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		
		guidePanel.add(space1);
		guidePanel.add(label1);
		guidePanel.add(space2);
		guidePanel.add(label2);
		guidePanel.add(space3);
		
		
		
		btnPanel.add(trainerProfileButton);
		btnPanel.add(buyTicketButton);
		btnPanel.add(ptConsultantResevationButton);
		
		
		trainerProfileButton.setSize(800,100);
		trainerProfileButton.setLocation(30, 520);
		trainerProfileButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		trainerProfileButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		trainerProfileButton.setContentAreaFilled(false); //버튼 영역 채우지 않음
		frame.add(trainerProfileButton); //버튼 출력
		
		buyTicketButton.setSize(800, 100);
		buyTicketButton.setLocation(30, 640);
		buyTicketButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		buyTicketButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		buyTicketButton.setContentAreaFilled(false); //버튼 영역 채우지 않음
		frame.add(buyTicketButton); //버튼 출력
		
		ptConsultantResevationButton.setSize(800, 100);
		ptConsultantResevationButton.setLocation(30, 760);
		ptConsultantResevationButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		ptConsultantResevationButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		ptConsultantResevationButton.setContentAreaFilled(false); //버튼 영역 채우지 않음
		frame.add(ptConsultantResevationButton); //버튼 출력
		
		
		
		
		
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		

		
		trainerProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				//트레이너 프로필 조회 버튼
			}
		});
		
		buyTicketButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이용권 구매 버튼
				
			}
		});
		
		ptConsultantResevationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PT 상담 예약 버튼
				
			}
		});
	}
	
}