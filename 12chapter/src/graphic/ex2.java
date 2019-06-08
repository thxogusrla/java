package graphic;

import java.awt.*;
import javax.swing.*;

public class ex2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public ex2() {
		setTitle("ex2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //panel을 패널로 설정해준다.
		setSize(250, 200);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("자바 개빡친다..", 30, 30); //drawString 메소드를 이용하여 문자열을 출력해준다. drawString(str, x, y)
			g.drawString("여거 곧 끝난다.!", 50, 50);
			
		}
	}
	public static void main(String[] args) {
		new ex2();
	}
}
