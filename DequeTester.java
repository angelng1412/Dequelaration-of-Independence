//Irene Lam
//APCS2 pd5
//HW#29 -- Stress is the Best
//2017-04-05

public class DequeTester {
    public static void main(String[] args) {
	Deque<String> table = new DLDeque<String>();
	System.out.println("=================== Basic Method Testers ===================\n");
	System.out.println("Enqueuing in the order of pudding, shrimpDumpling, porkBun, chopsticks, tea");
	table.addLast("porkBun");
	table.addFirst("shrimpDumpling");
	table.addLast("chopsticks");
	table.addLast("tea");
	table.addFirst("pudding");
	System.out.println("table toString: " + table);

	//System.out.println("Testing contains pudding: " + table.contains("pudding"));
	System.out.println("Peek first: " + table.peekFirst());
	System.out.println("Removing first: " + table.pollFirst());
	//System.out.println("Testing contains pudding: " + table.contains("pudding"));	
	System.out.println("Removing last: " + table.pollLast());
	System.out.println("Removing first: " + table.pollFirst());
	System.out.println("Removing first: " + table.pollFirst());
	System.out.println("Removing first: " + table.pollFirst());
	System.out.println("A now empty table: " + table);
	
	System.out.println("\n=================== Testing for Errors ===================\n"); 			   
	System.out.println("Removing on an empty deque: First - " + table.pollFirst() + " Last - " + table.pollLast());
	System.out.println("Peeking on an empty deque: First - " + table.peekFirst() + " Last - " + table.peekLast());
	/*
	System.out.println("\n=================== Errors that cannot be caught - PC ===================\n");
	System.out.println("Adding to the table what does not belong (a.k.a. numbers)");
	table.addFirst(1);
	System.out.println("Testing contains with what does not belong");
	table.contains(0);
	System.out.println("Outcome of the table: " + table.toString());
	*/
    }
}
