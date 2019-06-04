package component;

import javax.swing.*;
import java.awt.*;

public class pro4 extends JFrame {
	Color colorArr[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.blue, new Color(330066),
			new Color(660066), new Color(999999), Color.pink, Color.GRAY, Color.white, Color.DARK_GRAY, Color.black,
			Color.ORANGE, new Color(330066), new Color(660066) };

	pro4() {
		setTitle("ten color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(1,10);
		c.setLayout(grid);
		
		for(int i = 0 ; i<10; i++) {
			JButton btn = new JButton(i+"");
			btn.setBackground(colorArr[i]);
			c.add(btn);
		}
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro4();
	}
	
}
