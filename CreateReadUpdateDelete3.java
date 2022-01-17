//18.You are given a project to demonstrate the create, read, update, and delete operations on the files in Java.
package assignment;
//Update

public class CreateReadUpdateDelete3 {

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


