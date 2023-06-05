package boundary;
import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class paymentUI {
	
	
	
	public paymentUI() {
		
		JLabel titleLabel = new JLabel("ZYM CARRY");
		JLabel guideLabel = new JLabel("결제확인");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		JButton okButton = new JButton("확인");
		JButton cancelButton = new JButton("취소");
		
		
		panel.setBackground(Color.cyan);
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0));
		
		btnPanel.setOpaque(true);
		btnPanel.setBackground(Color.cyan);
		btnPanel.setSize(500,100); //로그인 라벨 크기 설정
		btnPanel.setLocation(200, 580);
		
		titleLabel.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		titleLabel.setBackground(Color.WHITE);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD,20)); //제목 라벨 글씨체, 굵기, 크기 설정
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
		frame.add(guideLabel); // 회원 등록 라벨 출력
		
		
		
        
        // 이미지 파일 경로 지정
        String imagePath = "images/payment.png";
        
        // 이미지 아이콘 생성
        ImageIcon imageIcon = new ImageIcon(imagePath);
        
        // 이미지 아이콘 크기 조절
        Image resizedImage = imageIcon.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        
        
        // 라벨 생성 및 크기 조절된 이미지 아이콘 설정
        JLabel imagelabel = new JLabel(resizedIcon);
        
        // 라벨을 프레임에 추가
        frame.getContentPane().add(imagelabel);
        

        // 프레임 크기 조정
        frame.pack();

        // 이미지 위치 설정
        imagelabel.setLocation(275, 180);
		
		

		
		okButton.setSize(110,150);
		okButton.setLocation(500, 300);
		okButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		okButton.setBackground(Color.white);
		okButton.setPreferredSize(new Dimension(110, 50)); 
		btnPanel.add(okButton); //버튼 출력

		
		cancelButton.setSize(510, 550);
		cancelButton.setLocation(500, 500);
		cancelButton.setFocusPainted(false); //버튼이 선택되었을 때 생기는 테두리 사용 안함
		cancelButton.setBackground(Color.white);
		cancelButton.setPreferredSize(new Dimension(110, 50));
		btnPanel.add(cancelButton); //버튼 출력

		
		
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
		        int choice = JOptionPane.showOptionDialog(frame, "결제 정보\n선택한 이용권 : 12개월\n선택한 락커 : 74번\n선택하신 상품으로 결제 하시겠습니까?", "상품정보확인", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (choice == JOptionPane.OK_OPTION) {
		            // OK button clicked
		            // Perform actions accordingly
		        	 JOptionPane.showMessageDialog(null, "결제가 완료되었습니다 !!");
		        	 frame.dispose();
		        	 new startUI();
		        	
		        } else if (choice == JOptionPane.CANCEL_OPTION) {
		            // Cancel button clicked
		            // Perform actions accordingly
		        }
		    }
		});
		
		cancelButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frame.dispose();
				JOptionPane.showMessageDialog(null, "처음으로 돌아갑니다.", "안내", JOptionPane.WARNING_MESSAGE);
				new mainUI();
		    }
		});
		
	}
	
	

}
