package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex8 extends JFrame {

	ex8() {
		setTitle("ex8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터공학과", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("서울시...", 20));

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex8();
	}
}
