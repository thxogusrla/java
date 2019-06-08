package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex9 extends JFrame {
	private JTextField tf = new JTextField(20); //글을 쓸수있는 공간인데  area와랑은 무슨차이냐 한 줄로만 쓸수 있게 한다.
	private JTextArea ta = new JTextArea(7,20); //여러 줄을 입력받을 수 있는 글쓰기 창을 만들어준다.
	ex9(){
		setTitle("ex9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		c.add(new JLabel("입력후 엔터키를 입력"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				
				t.setText("");
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex9();
	}
}
