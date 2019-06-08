package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex6 extends JFrame {
	public ex6() {
		setTitle("라디오버튼예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("1/cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("1/selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup(); //버튼들을 g라는 그룹에 묶기 위해 선언함.
		//버튼 그룹을 사용하게 되면 다른 것을 선택한다면 원래 선택 되어있던 것은 해제된다.
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배"); //true로 선택이 되어있기 때문에 처음 상태로 선택되어있다.
		JRadioButton cherry = new JRadioButton("체리", cherryIcon, true);
		
		cherry.setBorderPainted(true); //외곽선 출력.
		cherry.setSelectedIcon(selectedCherryIcon); //
		
		g.add(apple); 	// 그룹 g에 apple 추가
		g.add(pear); 	// 그룹 g에 pear 추가
		g.add(cherry);	// 그룹 g에 cherry 추가.
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex6();
	}
}
