package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 예제2 extends JFrame {
	
	예제2(){
		setTitle("레이블예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사랑해용~"));
		
		ImageIcon beauty = new ImageIcon("1/beauty.jpg");
		JLabel imagelabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("1/normalIcon.gif");
		JLabel label = new JLabel("전화해라 ㅡㅡ",normalIcon,SwingConstants.CENTER);
		
		c.add(imagelabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 예제2();
		
	}
}
