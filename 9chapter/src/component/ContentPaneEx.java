package component;
import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); // ������ �̸� �ޱ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷��� �����ϵ��� ����. �� ������ ������ ����ǵ� ���ø����̼��� �����.
		
		Container contentPane = getContentPane(); // getContentpane()�� ����Ʈ ���� �˾Ƴ���. ��� �� contentPane�� ����� ���̶�� �ǹ��ΰ�?
		contentPane.setBackground(Color.ORANGE); // contentPane ����Ʈ���� ������ ������.
		contentPane.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�. ������Ʈ�� ��ġ�� ũ�� ����.
		
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
