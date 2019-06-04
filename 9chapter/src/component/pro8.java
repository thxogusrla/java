package component;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class NPanel extends JPanel {
	public NPanel() {
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));

	}
}

class CPanel extends JPanel {
	public CPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		for (int i = 0; i < 10; i++) {
			JLabel la = new JLabel("*"); //* 모양의 레이블이 만들어졌고 
			la.setSize(20, 20); //크기는 20 * 20으로 고정시켜준다음.
			la.setBackground(Color.BLUE); //레이블의 배경색을 파랑으로 해준다.
			la.setLocation((int) (Math.random() * 200 + 10), (int) (Math.random() * 200 + 10)); //레이블이 생기는 위치를 랜덤하게 적용해주고.
			add(la); // 위치와 크기 그리고 색이 다 정해진 레이블이 추가된다.
		}
	}
}

class SPanel extends JPanel {
	public SPanel() {
		setBackground(Color.YELLOW);
		add(new JLabel("Word Input"));
		add(new JTextField(16));

	}
}

public class pro8 extends JFrame {
	pro8() {
		setTitle("여러개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(new NPanel(), BorderLayout.NORTH);
		c.add(new CPanel(), BorderLayout.CENTER);
		c.add(new SPanel(), BorderLayout.SOUTH);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new pro8();
	}
}