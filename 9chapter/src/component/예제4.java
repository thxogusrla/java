package component;

import javax.swing.*;
import java.awt.*;

public class ����4 extends JFrame{
	����4(){
		setTitle("border layout������ ����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.WEST);
		c.add(new JButton("div"), BorderLayout.EAST);
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ����4();
	}
}
