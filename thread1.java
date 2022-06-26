package thread1;

import java.lang.Thread;
class multiwork extends Thread
{
    int [] values={4,5,6,7,8,3,2,3,4,5,6,4,3,2,4,5,4};	
    public void run()
    {
    	for(int i=0;i<values.length;i++)
    	{
    		System.out.println(values[i] + "Hi");
    		try{
    			Thread.sleep(1000);
    		}
    		catch(Exception e){
    		}
    	}
    }
}

class multiwork2 extends Thread
{
	int [] values={4,5,6,7,8,3,2,3,4,5,6,4,3,2,4,5,4};	
    public void run()
    {
    	for(int i=0;i<values.length;i++)
    	{
    		System.out.println(values[i] +"Hello");
    		try{
    			Thread.sleep(1000);
    		}
    		catch(Exception e){
    		}
    	}
    }
}


public class thread1 {
     public static void main(String []args)
     {
    	 Thread x1=new multiwork();
    	 Thread x2=new multiwork2();
    	 x1.start();
    	 try{
 			Thread.sleep(1000);
 		}
 		catch(Exception e){
 		}
    	 x2.start();
    	 
     }
}
