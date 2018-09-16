package BuddyInfo;

import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> lists = new ArrayList();
	
	public void addBuddy(BuddyInfo a) {
		lists.add(a);
	}
	public void removeBuddy(BuddyInfo a) {
		lists.remove(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address book");
		
		BuddyInfo n = new BuddyInfo();
		n.setName("unknown");
		n.setPhoneNumber(0000000000);
		
		
		AddressBook a = new AddressBook();
		a.addBuddy(n);
		a.removeBuddy(n);
	}
}
