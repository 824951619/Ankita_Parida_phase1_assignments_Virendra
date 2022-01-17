//4. Write a program to demonstrate different methods of different return types.
package assignment;
public class MethodExecution {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	MethodExecution b=new MethodExecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}
}


