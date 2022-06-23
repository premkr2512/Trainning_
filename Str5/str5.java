package Str5;

public class str5 {
          public static void main(String [] args)
          {
        	  String S1=new String("Prem Kumar");
        	  String S2=new String("Rahul Kumar");
        	  for(int i=S1.length();i>=0;i--)
        	  {
        		  if(S2.contains(S1.substring(i,S1.length())))
        				  {
        			  System.out.println("True");
        			  break;
        				  }
        	  }
        	  
          }
}
