package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����2 extends JFrame {
	public ����2() {
		setTitle("����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener2());
		c.add(btn);
		
		setSize(400,200);
		setVisible(true);
	}

	private class MyActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");

			����2.this.setTitle(b.getText());
		}

	}

	public static void main(String[] args) {
		new ����2();
	}
}
