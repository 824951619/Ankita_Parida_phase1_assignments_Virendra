//4. Write a program to demonstrate different methods of different return types.
package assignment;
public class CallValue {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	CallValue d = new CallValue();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}



