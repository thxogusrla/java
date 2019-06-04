package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyActionListener1 implements ActionListener{ //이벤트 리스너

	@Override
	public void actionPerformed(ActionEvent e) { 
		JButton b = (JButton)e.getSource(); //이벤트 소스를 알아내고.
		if(b.getText().equals("Action")) b.setText("액션");
		else b.setText("Action");
	}
	
}
public class 예제1 extends JFrame {
	public 예제1() {
		setTitle("actionlistener 달기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener1()); //Action이란 버튼에 액션 리스너를 달아주었다. 그래서 버튼을 누르면 actionlistener가 발생하게 된다.
		c.add(btn);// 모든 작업이 끝난 btn은 컨텐트 펜에 붙여진다.
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 예제1();
	}

}

