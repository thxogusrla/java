package component;

import javax.swing.*;
import java.awt.*;

public class ����2 extends JFrame {
	����2(){
		setTitle("contentpane �� jfram");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //c�� ����Ʈ���� �����ϰڴ�. �̰ǰ�.
		c.setLayout(new FlowLayout()); // ��ġ�����ڸ� flowlayout�� ����ϰڴٴ� �Ű�
		
		c.add(new JButton("ok")); //contentpane�� ok��� ��ư�� ����.
		c.add(new JButton("cancel")); //contentpane�� cancel�̶�� ��ư�� ����.
		c.add(new JButton("ignore")); // contentpane �� ignor�̶�� ��ư�� ����.
		c.setBackground(Color.ORANGE);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ����2();
	}
}
