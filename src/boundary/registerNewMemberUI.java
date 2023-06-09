package boundary;

import control.*;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Btn_Design.*;


// 회원 로그인
public class registerNewMemberUI {
	registerSystem db = new registerSystem();
	

	public registerNewMemberUI() {
		
		String UserName;
		String UserPhone;
		String UserBirth;
		String UserSex;
		
		JLabel titleLabel = new JLabel("ZYM CARRY");
		JLabel guideLabel = new JLabel("회원 등록");
		JLabel nameLabel = new JLabel("이름");
		JLabel phoneLabel = new JLabel("전화번호");
		JLabel birthLabel = new JLabel("나이");
		JLabel sexLabel = new JLabel("성별");
		JTextField nameTextField = new JTextField(17);
		JTextField phoneTextField = new JTextField(15);
		JTextField birthTextField = new JTextField(15);
		JTextField sexTextField = new JTextField(17);
		
		JButton okButton = new JButton("확인");
		JButton cancelButton = new JButton("취소");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel subPanel = new JPanel();
		
		
		panel.setBackground(Color.CYAN);
		
		titleLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //제목 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(300,50); //제목 라벨 크기 설정
		titleLabel.setLocation(300, 50); //제목 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		frame.add(titleLabel); //제목 라벨 출력
		
		guideLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		guideLabel.setBackground(Color.WHITE);
		guideLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //회원 등록 라벨 글씨체, 굵기, 크기 설정
		guideLabel.setSize(300,50); //회원 등록 라벨 크기 설정
		guideLabel.setLocation(300, 110); //회원 등록 라벨 위치 설정
		guideLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		frame.add(guideLabel); //회원 등록 라벨 출력
		
		
		subPanel.setOpaque(true);
		subPanel.setBackground(Color.WHITE);
		subPanel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		subPanel.setSize(700,500);
		subPanel.setLocation(100, 210);
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
		
		nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
//		nameLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		phoneLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
//		phoneLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		birthLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
//		birthLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		sexLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
//		sexLabel.setBorder(new LineBorder(Color.black, 1, true)); // 외곽선 설정
		
		nameTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		phoneTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		birthTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		sexTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		
	
		okButton.setSize(70,50);
		okButton.setLocation(300, 500);
		okButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		okButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		okButton.setContentAreaFilled(true); //버튼 영역 활성화
		okButton.setBackground(Color.orange);
		subPanel.add(okButton); //버튼 출력
		
		cancelButton.setSize(70, 50);
		cancelButton.setLocation(500, 500);
		cancelButton.setBorderPainted(false); //버튼 테두리(외곽선) 없앰
		cancelButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		cancelButton.setContentAreaFilled(true); //버튼 영역 활성화
		cancelButton.setBackground(Color.orange);
		subPanel.add(cancelButton); //버튼 출력
		
	
		
		
		
		
		
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
		
		//이벤트 처리 추가

		

		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				/* TextField에 입력된 회원 정보들을 변수에 초기화 */
				String uname = nameTextField.getText();
				String uphone = phoneTextField.getText();
				String uyear = birthTextField.getText();
				String usex = sexTextField.getText();

				
				//String uAcc = "0";
				//String uCheck = "0";
				System.out.println(uname);
				System.out.println(usex);
				System.out.println(uyear);
				System.out.println(uphone);
				
				
								
				/* 가입하기 버튼 이벤트 */
				// 실패하면 무조건 프로그램이 꺼짐 -> 수정 요망 계속 켜져있도록 해야함
				if(b.getText().equals("확인")) {
					if(uname.equals("") || usex.equals("") || uyear.equals("") || uphone.equals(""))
					{
						JOptionPane.showMessageDialog(null, "모든 정보를 기입해주세요", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
						System.out.println("회원가입 실패 > 회원정보 미입력");
					}
					
					else
					{
						 
							// 카드번호 전화번호가 존재하는지를 먼저 판별하고 회원 가입하기.		
							if((!(uphone.length() == 11)))
							{
								JOptionPane.showMessageDialog(null, "전화번호는 11자리로 입력하세요.");
							}
							
							else
							{
								if(db.registerUser(uname, usex, uyear, uphone)) {

										System.out.println("회원가입 성공");
										JOptionPane.showMessageDialog(null, "회원가입 성공!");
										db.dbclose();
										new startUI(); //회원가입 성공시 ID로그인 페이지로 이동
									} 
								
								else {
									System.out.println("회원가입 실패");
									JOptionPane.showMessageDialog(null, "회원가입 실패");
									nameTextField.setText("");
									}
							
							}
							
					}
						/* 빈칸이 없을시 회원가입이 되는 코드 */
					
					
					
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//뒤로가기 버튼
				frame.setVisible(false);
				frame.dispose();
				new startUI();
			}
		});
	}
	

}