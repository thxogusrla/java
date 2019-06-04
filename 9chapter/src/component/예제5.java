package component;

import javax.swing.*;
import java.awt.*;

public class 예제5 extends JFrame {
	예제5(){
		setTitle("Gridlayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5); //수직간격 setVgap();
		
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));  //GridLayout 이 4 X 2 이기 떄문에 레이블 - 텍스트 필드 형식으로 만들어진다.
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
//		c.add(new JButton("제출"));
		
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 예제5();
	}
}
