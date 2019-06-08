package swing;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

public class pro2 extends JFrame {
	private JTextField tf = new JTextField(20);
	private JComboBox<String> name = new JComboBox<String>();
	private Vector<String> v = new Vector<String>();

	public pro2() {
		setTitle("pro2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(tf);
		c.add(name);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField jtf = (JTextField)e.getSource();
				name.addItem(jtf.getText());
				
				jtf.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro2();
	}
}
