package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ex11 extends JFrame {
	private JTextField tf = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> strlist = new JList<String>(v);

	public ex11() {
		setTitle("ex11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("이름 입력 후 엔터"));
		c.add(tf);
		
		v.add("황기태");
		v.add("김태현");
		
		strlist.setVisibleRowCount(7);
		strlist.setFixedCellWidth(100);
		c.add(new JScrollPane(strlist));
		
		setSize(300, 300);
		setVisible(true);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				t.setText("");
				strlist.setListData(v);
			}
		});
	}

	public static void main(String[] args) {
		new ex11();

	}
}
