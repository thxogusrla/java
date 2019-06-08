package swing;

import javax.swing.*;
import java.awt.*;

public class ex10 extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon []images = {
			new ImageIcon("1/icon1.png"),
			new ImageIcon("1/icon2.png"),
			new ImageIcon("1/icon3.png"),
			new ImageIcon("1/icon4.png")
	};
	
	public ex10() {
		setTitle("ex10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strlist = new JList<String>(fruits);
		c.add(strlist);
		
		JList<ImageIcon> imagelist = new JList<ImageIcon>(images);
		c.add(imagelist);
		
		JList<String> scrolllist = new JList<String>(fruits);
		c.add(new JScrollPane(scrolllist)); //스크롤 바를 가지는 리스트
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex10();
	}
}
