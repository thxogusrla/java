package component;

import javax.swing.*;
import java.awt.*;

public class 예제6 extends JFrame {
	예제6(){
		setTitle("null caotainer sample"); //배치관리자가 없음.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램이 종료되면 완벽히 종료됨.
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("hello, press buttons!");
		la.setLocation(130,50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i = 0; i<=9; i++) {
//			JButton b = new JButton(i+"");
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 예제6();
	}
}
