package component;

import javax.swing.*;
import java.awt.*;

public class 예제3 extends JFrame {
	
	예제3(){
		
		setTitle("flowlayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("calculate"));
		
		setSize(400,200); //프레임 크기를 400 * 200으로 나타내겠다.
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 예제3();
	}

}
