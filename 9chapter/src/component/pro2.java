package component;

import javax.swing.*;
import java.awt.*;
public class pro2 extends JFrame {
	pro2(){
		setTitle("BorderLayout practice");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("center"),BorderLayout.CENTER);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		
		setSize(400,200); // setsize와 setvisible 을 나중에 해주는 이유는 아직 컨테이너와 컨텐트팬에 아무것도 붙지 않았기 때문.
		setVisible(true);
		}
	public static void main(String[] args) {
		new pro2();
	}
}
