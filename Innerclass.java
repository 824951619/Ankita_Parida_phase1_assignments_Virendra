//7."Write a program to demonstrate the working of inner classes.
package assignment;

class Outer {
	
    class Inner {
 
        
        public void show()
        {
 
           
            System.out.println("In a nested class method");
        }
    }
}
 

class InnerClass {
 
    public static void main(String[] args)
    {
 
        
        Outer.Inner in = new Outer().new Inner();
   
        in.show();
    }
}

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
