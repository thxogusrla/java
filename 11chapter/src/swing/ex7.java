package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex7 extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = { "사과", "배", "체리" };
	private ImageIcon[] image = { new ImageIcon("1/apple.jpg"), new ImageIcon("1/pear.jpg"),
			new ImageIcon("1/cherry.jpg"), }; //이미지를 모아놓은 배열.
	private JLabel imageLabel = new JLabel(); //

	ex7() {
		setTitle("ex7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);

		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}

		radio[2].setSelected(true); //체리가 먼저 선택된 상태로 나온다.
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(250, 200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) { //선택 상태가 변할때 발생하는 메소드. 
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.DESELECTED) return;
			if(radio[0].isSelected()) imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) imageLabel.setIcon(image[1]);
			else imageLabel.setIcon(image[2]);
		}
	}
	public static void main(String[] args) {
		new ex7();
	}
}
