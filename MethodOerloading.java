//4. Write a program to demonstrate different methods of different return types.
package assignment;
public class MethodOerloading {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	MethodOerloading ob=new MethodOerloading();
       ob.area(10,12);
       ob.area(5);  
   }
}


