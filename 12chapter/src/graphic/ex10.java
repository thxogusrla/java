package graphic;

import java.awt.*;
import javax.swing.*;

import graphic.ex7.MyPanel;

import java.util.*;
import java.awt.event.*;

public class ex10 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex10() {
		setTitle("ex7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private Vector<Point> sv = new Vector<Point>();
		private Vector<Point> ev = new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Point startp = e.getPoint();
				sv.add(startp);
				
			}
			public void mouseReleased(MouseEvent e) {
				Point endP = e.getPoint();
				ev.add(endP);
				
				repaint(); //왜 이걸 붙여줬지...?
			}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			for (int i = 0; i < sv.size(); i++) {
				Point s = sv.elementAt(i);
				Point e = ev.elementAt(i);
				
				g.drawLine(s.x, s.y, e.x, e.y);
			}
		}
	}

	public static void main(String[] args) {
		new ex10();
	}
}
