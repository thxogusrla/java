package component;
import java.awt.Container;

import javax.swing.*;
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� ������ ����� title�� ������ �������ش�.");
		setSize(500,500); //size�� ���״�� ũ�⸦ ������ �ְ�.
		setVisible(true); //������ ����϶�� ���̴�. false �̸� ����� ������ ���� �ȴ�.
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();  
		
	}
}
