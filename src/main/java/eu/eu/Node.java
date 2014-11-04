package eu.eu;

public class Node {
	  //*** fields ***
	    public String value;
	    public Node next;

	  //*** methods ***
	    // 2 constructors
	    public Node(String v) {
		this(v, null);
	    }

	    public Node(String v, Node n) {
		value = v;
		next = n;
	    }
	   		   
	   
	}
