package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����3 extends JFrame {
	public ����3(){
		setTitle("����3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() { //�͸� Ŭ���� �����.
			public void actionPerformed(ActionEvent e) { //��ư Ŭ���� �̺�Ʈ ��ü�� �����ǰ� �̺�Ʈ �����ʰ� ó�����ش�. 
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) b.setText("�׼�");
				else b.setText("Action");
			}
		});
		c.add(btn);
		setSize(400, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ����3();
	}
}
