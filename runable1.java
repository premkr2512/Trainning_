package runable1;

import java.lang.Runnable;
class multiwork implements Runnable
{
    int [] values={4,5,6,7,8,3};	
    public void run()
    {
    	for(int i=0;i<values.length;i++)
    	{
    		System.out.println("Runable "+ i+" " + values[i] + " Hi");
    		try{
    			Thread.sleep(1000);
    		}
    		catch(Exception e){
    		}
    	}
    }
}

class multiwork2 implements Runnable
{
	int [] values={4,5,6,7,8,3};	
    public void run()
    {
    	for(int i=0;i<values.length;i++)
    	{
    		System.out.println("Runable "+ i+"  " + values[i] +" Hello");
    		try{
    			Thread.sleep(1000);
    		}
    		catch(Exception e){
    		}
    	}
    }
}


public class runable1 {
     public static void main(String []args)
     {
    	 Runnable x1=new multiwork();
    	 Runnable x2=new multiwork2();
    	 Thread t1=new Thread(x1);
    	 Thread t2=new Thread(x2);
    	 t1.start();
    	 try{
 			Thread.sleep(1000);
 		}
 		catch(Exception e){
 		}
    	 t2.start();
    	 
     }
}
