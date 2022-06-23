package StrDemo4;

public class strDemo4 {

    public static void main(String[] args)
    {
        // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str = "";
         for(int i=0;i<arr_num.length;i++)
         {
        	  str=str+arr_num[i]; 
         }
         
        // Display the results of the new String.
        System.out.println("\nThe book contains " + str +" pages.\n");
    }
}

