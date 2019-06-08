package swing;
import java.awt.*;
import javax.swing.*;

public class ex14 extends JFrame {
	public ex14() {
		setTitle("ex14");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); //�������� �����̴��� ��Ÿ���� �ּҰ��� 0�̰� �ִ밪�� 200 �ʱⰪ�� 100���� ������.
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true); //����ٷ� �ش� ��ġ���� ä������ ����.
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex14();
	}
}
