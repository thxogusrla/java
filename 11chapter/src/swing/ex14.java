package swing;
import java.awt.*;
import javax.swing.*;

public class ex14 extends JFrame {
	public ex14() {
		setTitle("ex14");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); //수평으로 슬라이더를 나타내고 최소값은 0이고 최대값은 200 초기값은 100으로 설정됨.
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true); //막대바로 해당 위치까지 채워짐을 보임.
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
