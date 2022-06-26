package lambdaThread;

public class lambdaT {
     public static void main(String []args)
     {
    	 int [] values={4,5,6,7,8,3};
    	 Runnable x1=()->
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
    		 };
    	 Runnable x2=()->
    	    {
    	    	for(int i=0;i<values.length;i++)
    	    	{
    	    		System.out.println("Runable "+ i+" " + values[i] + " Hello");
    	    		try{
    	    			Thread.sleep(2000);
    	    		}
    	    		catch(Exception e){
    	    		}
    	    	}
    	    };
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
