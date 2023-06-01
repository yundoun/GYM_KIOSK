package boundary;

import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MemberLoginUI {

	// btn 패널에 버튼 추가 함수
	private void addButtonToPanel(JPanel panel, JButton button, int x, int y) {
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.gridx = x;
	    gbc.gridy = y;
	    gbc.insets = new Insets(30, 30, 30, 0); // Adds padding around buttons
	    panel.add(button, gbc);
	}
	
	
	public JLabel titleLabel() {
		JLabel titleLabel = new JLabel("ZYM CARRY"); //로그인창을 알려주는 로그인 라벨
		
		titleLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD,20)); //제목 라벨 글씨체, 굵기, 크기 설정
		titleLabel.setSize(300,50); //제목 라벨 크기 설정
		titleLabel.setLocation(300, 50); //제목 라벨 위치 설정
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		
		return titleLabel;
	}
	
	public JLabel guideLabel() {
		JLabel guideLabel = new JLabel("비밀번호로 로그인 하세요");
		guideLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		guideLabel.setBackground(Color.WHITE);
		guideLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20)); //회원 등록 라벨 글씨체, 굵기, 크기 설정
		guideLabel.setSize(300,50); //회원 등록 라벨 크기 설정
		guideLabel.setLocation(300, 110); //회원 등록 라벨 위치 설정
		guideLabel.setHorizontalAlignment(JLabel.CENTER); //가운데 정렬
		
		return guideLabel;
	}
	
	
	public MemberLoginUI() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel(); //버튼 패널
		JTextField textField = new JTextField();
		
		panel.setBackground(Color.CYAN); //흰색 RGB코드, 불투명하게
		
		
		frame.add(titleLabel()); //제목 라벨 출력
		frame.add(guideLabel()); // 회원 등록 라벨 출력

		btnPanel.setLayout(new GridLayout(4, 4, 10, 10));
		btnPanel.setOpaque(true);
		btnPanel.setBackground(Color.WHITE);
		btnPanel.setSize(500,400); //로그인 라벨 크기 설정
		btnPanel.setLocation(200, 300);
		
		
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setSize(300,50);
		textField.setLocation(300, 200);
		frame.add(textField);
		
		JButton num1 = new JButton("1");
		JButton num2 = new JButton("2");
		JButton num3 = new JButton("3");
		JButton blank = new JButton("");
		JButton num4 = new JButton("4");
		JButton num5 = new JButton("5");
		JButton num6 = new JButton("6");
		JButton blank2 = new JButton("");
		JButton num7 = new JButton("7");
		JButton num8 = new JButton("8");
		JButton num9 = new JButton("9");
		JButton num0 = new JButton("0");
		JButton clearButton = new JButton("C");
		JButton delButton = new JButton("del");
		JButton okButton = new JButton("확인");
		JButton cancelButton = new JButton("취소");

		blank.setBorder(null);
		blank.setBackground(Color.white);
		blank.setEnabled(false);
		blank2.setBorder(null);
		blank2.setBackground(Color.white);
		blank2.setEnabled(false);
		
		addButtonToPanel(btnPanel, num1, 0, 0);
		addButtonToPanel(btnPanel, num2, 1, 0);
		addButtonToPanel(btnPanel, num3, 2, 0);
		addButtonToPanel(btnPanel, blank, 3,0);
		addButtonToPanel(btnPanel, num4, 0, 1);
		addButtonToPanel(btnPanel, num5, 1, 1);
		addButtonToPanel(btnPanel, num6, 2, 1);
		addButtonToPanel(btnPanel, blank2, 3,1);
		addButtonToPanel(btnPanel, num7, 0, 2);
		addButtonToPanel(btnPanel, num8, 1, 2);
		addButtonToPanel(btnPanel, num9, 2, 2);
		addButtonToPanel(btnPanel, okButton, 3, 1);
		addButtonToPanel(btnPanel, clearButton, 0, 3);
		addButtonToPanel(btnPanel, num0, 1, 3);
		addButtonToPanel(btnPanel, delButton, 2, 3);
		addButtonToPanel(btnPanel, cancelButton,3,3);
		

		frame.add(btnPanel);
		frame.add(panel);
		
		frame.setResizable(false); //창 크기 조절 불가
		frame.setVisible(true); //창을 화면에 나타낼 것인지 설정
		frame.setSize(900, 800); //창 크기 설정
		frame.setPreferredSize(new Dimension(1920,1080)); //Dimension객체를 인자로 받으면서 해당 컴포넌트 기본크기를 결정
		frame.setLocationRelativeTo(null); //화면을 중간에 띄움
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 버튼을 활성화 시켜 X를 누르면 프로그램 종료
	
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼
				frame.setVisible(false);
				new mainUI();
			}
		});
		
		
	}
	

}
