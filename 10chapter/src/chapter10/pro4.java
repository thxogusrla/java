package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro4 extends JFrame {

	String text = "Love Java";
	JLabel la = new JLabel(text);

	pro4() {
		setTitle("Left Ű�� ���ڿ� �ٲٱ� ����"); // ���� ����
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ݱ� ��ư�� ������ �� ȭ�� �ݱ�

		// Jabel ������Ʈ ���� �� KeyListener�� �ܴ�.
		la.addKeyListener(new MyKeyAdapter());

		la.setSize(200, 50);
		add(la);
		setSize(400, 200);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pro4();
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
//			switch (e.getKeyCode()) { // �Է¹��� �ڵ尡
//			case KeyEvent.VK_LEFT: // <Left> Ű �϶�
//				la.setText(text); // text ��ĭ�� ������ ���
//				text = text.substring(1) + text.substring(0, 1);
//				break;
//			default:
//				break;
//			}
//		}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				text = text.substring(0,1) + text.substring(1);
				la.setText(text);
			}
		}

	}
}