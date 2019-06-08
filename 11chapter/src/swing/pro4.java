package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro4 extends JFrame {
	public pro4() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(400, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ȯ���� ���� ����
		String[] text = { "������", "����", "õ��", "500��", "100��", "50��", "10��", "1��" }; // ȯ���� ���� �̸�. ���̺�� ��µ�
		JTextField source; // ����ڷκ��� �ݾ��� �Էµ� �ؽ�Ʈ �ʵ�
		JTextField[] tf = new JTextField[8]; // ȯ��� ���� ������ ��µ� �ؽ�Ʈ�ʵ�
		JCheckBox[] box = new JCheckBox[7];

		MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);

			// �ݾ� ���̺�
			JLabel la = new JLabel("�ݾ�");
			la.setHorizontalAlignment(JLabel.CENTER); // ���η� ����
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);

			// �ݾ��� �Է��ϴ� JTextField
			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);

			// ��� ��ư
			JButton calcBtn = new JButton("���");
			calcBtn.setSize(70, 20);
			calcBtn.setLocation(210, 20);
			add(calcBtn);

			// ���� �׼��� ���� ����
			for (int i = 0; i < text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 20);
				la.setLocation(50, 50 + i * 20);
				add(la);

				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.RIGHT);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50 + i * 20);
				add(tf[i]);
				
				if (i < 7) {
					box[i] = new JCheckBox();
					box[i].setBorderPainted(true);
					box[i].setSize(20, 20);
					box[i].setLocation(200, 50 + i * 20);
					add(box[i]);
				}
				else return ;
			
			}
			

			// ��� ��ư�� Action ������
			calcBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = source.getText(); // �Էµ� �ݾ� ���ڿ�
					if (str.length() == 0)
						return; // �Էµ� �ݾ��� ����

					int money = Integer.parseInt(str); // �Էµ� �ݾ��� ������ ��ȯ
					int res;
					for (int i = 0; i < unit.length; i++) {
						res = money / unit[i]; // unit[i]�� ���� ���
						tf[i].setText(Integer.toString(res));
						if (res > 0)
							money = money % unit[i]; // money ����
					}
				}
			});
			
		}
	}

	public static void main(String[] args) {
		new pro4();
	}
}
