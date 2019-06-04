package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 예제3 extends JFrame {
	public 예제3(){
		setTitle("예제3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() { //익명 클래스 만들기.
			public void actionPerformed(ActionEvent e) { //버튼 클릭시 이벤트 객체가 생성되고 이벤트 리스너가 처리해준다. 
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) b.setText("액션");
				else b.setText("Action");
			}
		});
		c.add(btn);
		setSize(400, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new 예제3();
	}
}
