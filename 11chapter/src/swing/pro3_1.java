package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro3_1 extends JFrame {
	pro3_1() {
		setTitle("pro3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ȯ���� ���� ����
		String[] text = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" }; // ȯ���� ���� �̸�. ���̺�� ��µ�
		JTextField source; // ����ڷκ��� �ݾ��� �Էµ� �ؽ�Ʈ �ʵ�
		JTextField[] tf = new JTextField[8]; // ȯ��� ���� ������ ��µ� �ؽ�Ʈ�ʵ�

		MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);

			JLabel la = new JLabel("�ݾ�");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);

			source = new JTextField(30);
			source.setSize(70, 20);
			source.setLocation(100, 20);
			add(source);

			JButton calbtn = new JButton("���");
			calbtn.setSize(70, 20);
			calbtn.setLocation(180, 20);
			calbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = source.getText();
					int money = Integer.parseInt(str);
					int res;
					for (int i = 0; i < unit.length; i++) {
						if(str.length() == 0) return;
						res = money/unit[i];
						tf[i].setText(Integer.toString(res));
						money = money%unit[i];
						
					}
				}
			});
			add(calbtn);

			for (int i = 0; i < text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);

				la.setSize(50, 20);
				la.setLocation(20, 50 + i * 20);
				add(la);

				tf[i] = new JTextField(30);
				tf[i].setSize(70, 20);
				tf[i].setLocation(100, 50 + i * 20);
				add(tf[i]);
			}
		}
	}
	public static void main(String[] args) {
		new pro3_1();
	}
}
