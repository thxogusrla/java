package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex12 extends JFrame {
	private String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
			"blackberry" };
	private String[] names = { "kitae", "jeamoon", "hyosoo", "namsu" };

	public ex12() {
				
		setTitle("ex12");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> fcombo = new JComboBox<String>(fruits);
		c.add(fcombo);
		
		JComboBox<String> ncombo = new JComboBox<String>();
		for (int i = 0; i < names.length; i++) 
			ncombo.addItem(names[i]);
		setSize(300, 300);
		setVisible(true);
	}
}
