package chapter6;

import java.util.Calendar;

public class 실습문제5 {
	public static void printCal(String msg, Calendar cal) {
		int hour = cal.get(Calendar.HOUR);  //HOUR_OF_DAY 는 오후 1시이면 13이라는 값을 갖게 해준다.
		int minute = cal.get(Calendar.MINUTE);
		int ampm = cal.get(Calendar.AM_PM);

		System.out.println(msg + "시간은 " + hour + "시" + minute + "분입니다.");
		if(ampm == Calendar.PM) hour +=12; 
		if(hour > 4 && hour < 12) System.out.println("good morning");
		else if(hour >=12 && hour < 18) System.out.println("good afternoon");
		else if(hour >=18 && hour < 22) System.out.println("good evening"); 
		else System.out.println("good night");
	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCal("현재", now);
	}
}

