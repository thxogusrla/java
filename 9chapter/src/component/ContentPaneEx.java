package component;
import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); // 프레임 이름 달기.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램을 종료하도록 설정. 이 문장이 없으면 종료되도 어플리케이션은 실행됨.
		
		Container contentPane = getContentPane(); // getContentpane()은 컨텐트 팬을 알아낸다. 긍까 즉 contentPane을 사용할 것이라는 의미인가?
		contentPane.setBackground(Color.ORANGE); // contentPane 컨텐트펜의 배경색은 오랜지.
		contentPane.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 달기. 컴포넌트의 위치와 크기 설정.
		
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
