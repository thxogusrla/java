package swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro1 extends JFrame {
	private JCheckBox btn = new JCheckBox("��ư ��Ȱ��ȭ");
	private JCheckBox btn1 = new JCheckBox("��ư ���߱�");
	private JButton b = new JButton("�׽�Ʈ ��ư");
	public pro1() {
		setTitle("pro1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(btn);
		c.add(btn1);
		c.add(b);
		btn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					b.setEnabled(false);
				else b.setEnabled(true);
			}
		});
		btn1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					b.setVisible(false);
				else b.setVisible(true);
			}
		});
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro1();
	}
}
