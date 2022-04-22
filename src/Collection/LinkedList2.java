package Collection;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String>ll1=new LinkedList();
		ll1.add("Name");
		ll1.add("Address");
		ll1.add("Age");
		System.out.println(ll1);
        ll1.add(1,"Class");
        System.out.println(ll1); //adding element to specific position
        
    	LinkedList<String>ll2=new LinkedList();
    	ll2.add("Gender");
    	ll2.add("Contact No");
    	ll1.addAll(ll2); //addAll() adding all element of ll2 into ll1 at last
    	System.out.println(ll1);
    	
    	LinkedList<String>ll3=new LinkedList();
    	ll3.add("Height");
    	ll3.add("Weight");
    	ll1.addAll(0,ll3); //adding all elements of ll3 into ll1 at specific position
    	System.out.println(ll1);
    	
    	ll1.addFirst("ID");
    	System.out.println(ll1);//Adding element at first position
    	
    	ll1.addLast("Relision");
    	System.out.println(ll1);//Adding element at last position
	}

}
//All about add() method