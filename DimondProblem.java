//20. You are given a project to work and resolve the diamond problem using OOPs concepts.
package assignment;
interface DemoInterface  
{   
  
default void display()   
{   
System.out.println("The dispaly() method invoked");   
}   
}   
  
interface DemoInterface1 extends DemoInterface  
{   
      
}   
 
interface DemoInterface2 extends DemoInterface  
{  
      
}   
  
public class DimondProblem implements DemoInterface1, DemoInterface2  
{   
public static void main(String args[])   
{   
	DimondProblem obj = new DimondProblem();   
//calling method  
obj.display();   
}   
}  

