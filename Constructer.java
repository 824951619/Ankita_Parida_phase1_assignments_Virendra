//5. Write a program to demonstrate the uses of constructors and its types.
package assignment;




class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}

public class Constructer {

	public static void main(String[] args) {
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();

	}
}
}

