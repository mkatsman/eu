
package eu.eu;

public class LinkedList {

	public static void main (String[] args){
		Node n1= new Node("David");
		Node n2 = new Node("Masha", n1);
		Node n3 = new Node("Yulia", n2);
	    Node n4 = new Node("Rebecca", n3);
	    reverse1(n4);
	}
	
	public static void reverse(Node current){
		Node temp;
		Node previous = null;
		while(current !=null){
			temp = current.next;
		
			current.next = previous;	
			System.out.println(current.value);
			previous = current;
		
			current = temp;
            
			
		}
	
	}
	
	public static void reverse1(Node current){
   		Node  temp =null;
   		Node  previous = null;
   		while(current!= null){
   		System.out.println(current.value);	
   		temp = current.next;
   		current.next =previous;
   		previous = current;
   		current = temp;
   		}
   		
	}

	
}

