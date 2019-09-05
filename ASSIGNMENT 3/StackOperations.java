import java.util.Scanner;

class Stack {
	int stack[];
	int sptr;
	
	Stack(int size) {
		stack = new int[size];
		sptr = -1;
	}
	
	public void push(int elem) {
		if(sptr==stack.length-1)
			System.out.println("Stack Full!");
		else {
			sptr++;	
			stack[sptr] = elem;
		}	
	}
	
	public void pop() {
		if(sptr < 0) {
			System.out.println("Stack Empty!");
		}
		sptr--;
	}
	
	public void display() {
		for(int i=sptr; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
}

public class StackOperations {
	public static void main(String args[]) {
		Stack sObj = new Stack(8);
		Scanner input = new Scanner(System.in);
		int q=0;
		while(q==0) {
			System.out.println("\nSelect Operation:\n1.Push\n2.Pop\n3.Display\n4.Exit");
			int choice = input.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter element to be inserted: ");
					int elem = input.nextInt();
					sObj.push(elem);
					break;
					
				case 2:	
					sObj.pop();
					break;
				
				case 3:
					sObj.display();
					break;
					
				case 4: 
					System.exit(0);
				
				default:
					System.out.println("Enter proper choice!");
			}
		}
	}
}