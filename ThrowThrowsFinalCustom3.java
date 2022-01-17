//16.You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.
package assignment;

public class ThrowThrowsFinalCustom3 {

	public static void main(String[] args) {
		int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }


	}


