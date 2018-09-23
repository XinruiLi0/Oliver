package BuddyInfo;

public class BuddyInfo {
	private String name = "Xinrui Li";
	private int phoneNumber = 1234567890;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo a = new BuddyInfo();
		a.print();
		System.out.println(a.getName());
		System.out.println(a.getPhoneNumber());
		a.setName("unknown");
		a.setPhoneNumber(0000000000);
		System.out.println(a.getName());
		System.out.println(a.getPhoneNumber());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void print() {
		System.out.println("Hello world!");
	}
}
