package graphic;

import java.awt.*;
import javax.swing.*;

public class ex2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public ex2() {
		setTitle("ex2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); //panel�� �гη� �������ش�.
		setSize(250, 200);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹ� ����ģ��..", 30, 30); //drawString �޼ҵ带 �̿��Ͽ� ���ڿ��� ������ش�. drawString(str, x, y)
			g.drawString("���� �� ������.!", 50, 50);
			
		}
	}
	public static void main(String[] args) {
		new ex2();
	}
}
