package graphic;

import java.awt.*;
import javax.swing.*;

public class pro1_2 extends JFrame {
	public pro1_2(){
		super("�̹��� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("1/cherry.jpg");
		Image img = icon.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	
	static public void main(String[] args) {
		new pro1_2();
	}
}
