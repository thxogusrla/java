package component;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class NPanel extends JPanel {
	public NPanel() {
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));

	}
}

class CPanel extends JPanel {
	public CPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		for (int i = 0; i < 10; i++) {
			JLabel la = new JLabel("*"); //* ����� ���̺��� ��������� 
			la.setSize(20, 20); //ũ��� 20 * 20���� ���������ش���.
			la.setBackground(Color.BLUE); //���̺��� ������ �Ķ����� ���ش�.
			la.setLocation((int) (Math.random() * 200 + 10), (int) (Math.random() * 200 + 10)); //���̺��� ����� ��ġ�� �����ϰ� �������ְ�.
			add(la); // ��ġ�� ũ�� �׸��� ���� �� ������ ���̺��� �߰��ȴ�.
		}
	}
}

class SPanel extends JPanel {
	public SPanel() {
		setBackground(Color.YELLOW);
		add(new JLabel("Word Input"));
		add(new JTextField(16));

	}
}

public class pro8 extends JFrame {
	pro8() {
		setTitle("�������� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(new NPanel(), BorderLayout.NORTH);
		c.add(new CPanel(), BorderLayout.CENTER);
		c.add(new SPanel(), BorderLayout.SOUTH);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new pro8();
	}
}