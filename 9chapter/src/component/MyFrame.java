package component;
import java.awt.Container;

import javax.swing.*;
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("스윙 프레임 만들기 title은 제목을 설정해준다.");
		setSize(500,500); //size는 말그대로 크기를 설정해 주고.
		setVisible(true); //프레임 출력하라는 뜻이다. false 이면 출력을 숨기라는 뜻이 된다.
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();  
		
	}
}
