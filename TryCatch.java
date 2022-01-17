//15."You are given a project to demonstrate the uses of try-catch blocks in Java.

package assignment;
public class  TryCatch {  
	  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0;    
        }  
             
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  


