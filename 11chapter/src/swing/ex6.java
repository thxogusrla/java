package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex6 extends JFrame {
	public ex6() {
		setTitle("������ư����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("1/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("1/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup(); //��ư���� g��� �׷쿡 ���� ���� ������.
		//��ư �׷��� ����ϰ� �Ǹ� �ٸ� ���� �����Ѵٸ� ���� ���� �Ǿ��ִ� ���� �����ȴ�.
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��"); //true�� ������ �Ǿ��ֱ� ������ ó�� ���·� ���õǾ��ִ�.
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon, true);
		
		cherry.setBorderPainted(true); //�ܰ��� ���.
		cherry.setSelectedIcon(selectedCherryIcon); //
		
		g.add(apple); 	// �׷� g�� apple �߰�
		g.add(pear); 	// �׷� g�� pear �߰�
		g.add(cherry);	// �׷� g�� cherry �߰�.
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex6();
	}
}
