package 모의고사;
import java.util.ArrayList;

class IntList extends ArrayList<Integer>{
	public int[] getArray(){
		var a = new int[size()];
		for(int i = 0 ; i<size(); i++)
			a[i] = get(i);
		return a;
	}
}

public class 김태현_1 {
	static int getMax(int []a) throws Exception{
		if(a.length == 0) throw new Exception("empty array");
		int max = a[0];
		for(int i = 1; i<a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		try {
			var l = new IntList();
			l.add(3); l.add(2); l.add(4); l.add(1);
			var a = l.getArray();
			System.out.println(getMax(a));
			System.out.println(getMax(new int[0]));
		}catch(Exception a) {
			System.out.println("empty array");
		}
	}
}
