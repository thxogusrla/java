package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex9 extends JFrame {
	private JTextField tf = new JTextField(20); //���� �����ִ� �����ε�  area�Ͷ��� �������̳� �� �ٷθ� ���� �ְ� �Ѵ�.
	private JTextArea ta = new JTextArea(7,20); //���� ���� �Է¹��� �� �ִ� �۾��� â�� ������ش�.
	ex9(){
		setTitle("ex9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		c.add(new JLabel("�Է��� ����Ű�� �Է�"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				
				t.setText("");
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex9();
	}
}
