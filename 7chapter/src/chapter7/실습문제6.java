package chapter7;

import java.util.*;

class Location {
	private String city;
	private double longitude; // �浵
	private double latitude; // ����
	
	public Location(String city, double longitude, double latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setCity(String city) { 
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setLogitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLatitude() {
		return latitude;
	}
}
public class �ǽ�����6 {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();

	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String city = st.nextToken().trim();
			double logitude = Double.parseDouble(st.nextToken().trim());
			double latitude = Double.parseDouble(st.nextToken().trim());

			Location loc = new Location(city, logitude, latitude);
			dept.put(city, loc); // �ؽøʿ� ����
		}
	}

	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		System.out.println("---------------------------");
		while (it.hasNext()) {
			String city = it.next(); // ���� �̸� �˾Ƴ�
			Location loc = dept.get(city); // ���� �̸��� Ű���Ͽ� �ؽøʿ��� Locaiton ��ü ��

			System.out.print(loc.getCity() + "\t");
			System.out.print(loc.getLongitude() + "\t");
			System.out.println(loc.getLatitude());
		}
		System.out.println("---------------------------");
	}

	private void processQuery() {
		while (true) {
			System.out.print("���� �̸� >> ");
			String city = scanner.nextLine(); // ���� �̸� �Է�
			if (city.equals("�׸�"))
				return; // ����

			Location loc = dept.get(city); // �ؽøʿ��� ���ø� Ű�� �˻�
			if (loc == null) { // ���ð� �ؽøʿ� ���ٸ�
				System.out.println(city + "�� �����ϴ�.");
			} else { // �ؽøʿ��� �˻��� Student ��ü
				System.out.print(loc.getCity() + "\t");
				System.out.print(loc.getLongitude() + "\t");
				System.out.println(loc.getLatitude());
			}
		}
	}

	public void run() {
		read();
		printAll();
		processQuery();
	}

	public static void main(String[] args) {
		LocationManager man = new LocationManager();
		man.run();
	}
}
