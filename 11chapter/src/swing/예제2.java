package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����2 extends JFrame {
	
	����2(){
		setTitle("���̺���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("����ؿ�~"));
		
		ImageIcon beauty = new ImageIcon("1/beauty.jpg");
		JLabel imagelabel = new JLabel(beauty);
		
		ImageIcon normalIcon = new ImageIcon("1/normalIcon.gif");
		JLabel label = new JLabel("��ȭ�ض� �Ѥ�",normalIcon,SwingConstants.CENTER);
		
		c.add(imagelabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ����2();
		
	}
}
