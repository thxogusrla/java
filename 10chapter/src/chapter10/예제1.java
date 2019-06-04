package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyActionListener1 implements ActionListener{ //�̺�Ʈ ������

	@Override
	public void actionPerformed(ActionEvent e) { 
		JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ��� �˾Ƴ���.
		if(b.getText().equals("Action")) b.setText("�׼�");
		else b.setText("Action");
	}
	
}
public class ����1 extends JFrame {
	public ����1() {
		setTitle("actionlistener �ޱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener1()); //Action�̶� ��ư�� �׼� �����ʸ� �޾��־���. �׷��� ��ư�� ������ actionlistener�� �߻��ϰ� �ȴ�.
		c.add(btn);// ��� �۾��� ���� btn�� ����Ʈ �濡 �ٿ�����.
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ����1();
	}

}

