package chapter6;

import java.util.Calendar;

public class �ǽ�����5 {
	public static void printCal(String msg, Calendar cal) {
		int hour = cal.get(Calendar.HOUR);  //HOUR_OF_DAY �� ���� 1���̸� 13�̶�� ���� ���� ���ش�.
		int minute = cal.get(Calendar.MINUTE);
		int ampm = cal.get(Calendar.AM_PM);

		System.out.println(msg + "�ð��� " + hour + "��" + minute + "���Դϴ�.");
		if(ampm == Calendar.PM) hour +=12; 
		if(hour > 4 && hour < 12) System.out.println("good morning");
		else if(hour >=12 && hour < 18) System.out.println("good afternoon");
		else if(hour >=18 && hour < 22) System.out.println("good evening"); 
		else System.out.println("good night");
	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCal("����", now);
	}
}

