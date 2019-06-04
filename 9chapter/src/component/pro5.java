package component;

import javax.swing.*;
import java.awt.*;

public class pro5 extends JFrame {
	Color colorArr[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.blue,new Color(330066), new Color(660066), new Color(999999),
            Color.pink, Color.GRAY, Color.white, Color.DARK_GRAY, Color.black,
            Color.ORANGE, new Color(330066), new Color(660066)}; 
	pro5(){
		setTitle("grid color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // ����Ʈ ���� �������ְ�. 
		GridLayout grid = new GridLayout(4,4); //4 * 4 �� ���� �׸��带 ������ش�.
		c.setLayout(grid); // c.setLayout(new GridLayout(4,4)) ����.
		for (int i = 0; i < 16; i++) {
			JLabel la = new JLabel(i+"");
			la.setBackground(colorArr[i]); //������ ���̺� ������ ��������.
			la.setOpaque(true); //������ ���̰� ������.
			c.add(la);
		}
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro5();
	}
}

