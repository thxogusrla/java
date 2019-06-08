package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex13 extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon images[] = {
			new ImageIcon("1/apple.jpg"),
			new ImageIcon("1/banana.jpg"),			
			new ImageIcon("1/kiwi.jpg"),
			new ImageIcon("1/mango.jpg")
	};
	private JLabel la = new JLabel(images[0]);
	public ex13() {
		setTitle("ex13");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> fcombo = new JComboBox<String>(fruits);
		c.add(fcombo);
		c.add(la);
		
		fcombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex(); //선택된 인덱스가 index에 저장이 됨.
				la.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex13();
	}
}
