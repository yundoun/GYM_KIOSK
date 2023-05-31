package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Btn_Design.*;

// 회원 로그인
public class registerNewMemberUI {
	

	public registerNewMemberUI() {
		
		String UserName;
		String UserPhone;
		String UserBirth;
		String UserSex;
		
		JLabel titleLabel = new JLabel("ZYM CARRY");
		JLabel guideLabel = new JLabel("회원 등록");
		JLabel nameLabel = new JLabel("이름");
		JLabel phoneLabel = new JLabel("전화번호");
		JLabel birthLabel = new JLabel("생년월일");
		JLabel sexLabel = new JLabel("성별");
		JTextField nameTextField = new JTextField(17);
		JTextField phoneTextField = new JTextField(15);
		JTextField birthTextField = new JTextField(15);
		JTextField sexTextField = new JTextField(17);
		
		RoundedButton okButton = new RoundedButton("확인");
		RoundedButton backButton = new RoundedButton("취소");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel subPanel = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		
		panel.setBackground(Color.CYAN);
		
		titleLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //제목 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(800,100); //제목 라벨 크기 설정
		titleLabel.setLocation(30, 50); //제목 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		frame.add(titleLabel); //제목 라벨 출력
		
		guideLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		guideLabel.setBackground(Color.WHITE);
		guideLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40)); //회원 등록 라벨 글씨체, 굵기, 크기 설정
		guideLabel.setSize(800,100); //회원 등록 라벨 크기 설정
		guideLabel.setLocation(30, 200); //회원 등록 라벨 위치 설정
		guideLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		frame.add(guideLabel); //회원 등록 라벨 출력
		
		
		subPanel.setOpaque(true);
		subPanel.setBackground(Color.WHITE);
		subPanel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		subPanel.setSize(800,500);
		subPanel.setLocation(30, 310);
		frame.add(subPanel);
		
		// 여백 레이블
		JLabel space1 = new JLabel("                                                     ");
		space1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		JLabel space2 = new JLabel("                                                     ");
		space2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		JLabel space3 = new JLabel("                                                     ");
		space3.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		JLabel space4 = new JLabel("                                                     ");
		space4.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		subPanel.add(nameLabel);
		subPanel.add(nameTextField);
		subPanel.add(space1);
		subPanel.add(phoneLabel);
		subPanel.add(phoneTextField);
		subPanel.add(space2);
		subPanel.add(birthLabel);
		subPanel.add(birthTextField);
		subPanel.add(space3);
		subPanel.add(sexLabel);
		subPanel.add(sexTextField);
		subPanel.add(space4);
		subPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10)); //상하좌우 10씩 띄우기
		
		nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		nameLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		phoneLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		phoneLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		birthLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		birthLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		sexLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		sexLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		nameTextField.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		phoneTextField.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		birthTextField.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		sexTextField.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		
		
		btnPanel.add(okButton); // 확인 버튼
		btnPanel.add(backButton); // 취소 버튼
		
		
		okButton.setSize(110,50);
		okButton.setLocation(300, 900);
		okButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		okButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		okButton.setContentAreaFilled(false); //버튼 영역 채우지 않음
		frame.add(okButton); //버튼 출력
		
		backButton.setSize(110, 50);
		backButton.setLocation(500, 900);
		backButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		backButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		backButton.setContentAreaFilled(false); //버튼 영역 채우지 않음
		frame.add(backButton); //버튼 출력
		
	
		
		
		
		
		
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 1000); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		

		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				//확인 버튼
			}
		});
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//뒤로가기 버튼
				frame.setVisible(false);
			}
		});
	}
	

}