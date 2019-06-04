package component;
import javax.swing.*;
import java.awt.*;
public class pro3 extends JFrame{
	pro3(){
		setTitle("tne color buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10); //
		grid.setVgap(0);
		
		Container c = getContentPane();
		c.setLayout(grid);

		for (int i = 0; i < 10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		
		
		setSize(800,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro3();
	}
}
