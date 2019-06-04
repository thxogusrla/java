package component;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("보더레이아웃 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("add"), BorderLayout.CENTER);
		c.add(new JButton("sub"), BorderLayout.NORTH);
		c.add(new JButton("mul"),BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.EAST);
		c.add(new JButton("Calculator"), BorderLayout.WEST);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
