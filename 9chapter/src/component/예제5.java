package component;

import javax.swing.*;
import java.awt.*;

public class ����5 extends JFrame {
	����5(){
		setTitle("Gridlayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5); //�������� setVgap();
		
		c.setLayout(grid);
		c.add(new JLabel(" �̸�"));  //GridLayout �� 4 X 2 �̱� ������ ���̺� - �ؽ�Ʈ �ʵ� �������� ���������.
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
//		c.add(new JButton("����"));
		
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ����5();
	}
}
