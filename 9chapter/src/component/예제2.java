package component;

import javax.swing.*;
import java.awt.*;

public class 예제2 extends JFrame {
	예제2(){
		setTitle("contentpane 과 jfram");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //c에 컨텐트펜을 연결하겠다. 이건가.
		c.setLayout(new FlowLayout()); // 배치관리자를 flowlayout을 사용하겠다는 거고
		
		c.add(new JButton("ok")); //contentpane에 ok라는 버튼을 붙임.
		c.add(new JButton("cancel")); //contentpane에 cancel이라는 버튼을 붙임.
		c.add(new JButton("ignore")); // contentpane 은 ignor이라는 버튼을 붙임.
		c.setBackground(Color.ORANGE);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 예제2();
	}
}
