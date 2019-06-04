package component;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class NorthPanel extends JPanel {  //JPanel의 디폴트 배치관리자는 FlowLayout 이고
	public NorthPanel() {
//		setLayout(new FlowLayout());
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(20));
		setLayout(new FlowLayout());

	}
}

class CenterPanel extends JPanel { //FlowLayout default manager
	JButton b[] = { new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/") };

	public CenterPanel() {
		setLayout(new GridLayout(4, 4, 2, 2));
		for (int i = 0; i < 10; i++)
			add(new Button(Integer.toString(i))); // 0~9까지 출력
		add(new Button("CE")); //
		add(new Button("계산")); //
		for (int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.BLUE);
			add(b[i]);
		}
	}
}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setLayout(new FlowLayout());
		setBackground(Color.YELLOW);
		add(new JLabel("계산 결과"));
		add(new JTextField(16));

	}
}

public class pro7 extends JFrame { //JFrame 의 디폴트 배치관리자는 BorderLayout이다
	pro7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new pro7();
	}
}
