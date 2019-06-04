package component;

import javax.swing.*;
import java.awt.*;

public class pro5 extends JFrame {
	Color colorArr[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.blue,new Color(330066), new Color(660066), new Color(999999),
            Color.pink, Color.GRAY, Color.white, Color.DARK_GRAY, Color.black,
            Color.ORANGE, new Color(330066), new Color(660066)}; 
	pro5(){
		setTitle("grid color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 컨텐트 펜을 생성해주고. 
		GridLayout grid = new GridLayout(4,4); //4 * 4 를 갖는 그리드를 만들어준다.
		c.setLayout(grid); // c.setLayout(new GridLayout(4,4)) 가능.
		for (int i = 0; i < 16; i++) {
			JLabel la = new JLabel(i+"");
			la.setBackground(colorArr[i]); //생성된 레이블에 배경색을 설정해줌.
			la.setOpaque(true); //배경색이 보이게 설정함.
			c.add(la);
		}
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro5();
	}
}

