package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex4 extends JFrame {

	ex4() {
		setTitle("ex4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("1/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("1/selectedCherry.jpg"); //

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);

		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon); //이미지가 선택되면 해당 이미지로 변함.

		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex4();
	}
}
