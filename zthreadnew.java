package threadnew;
import java.util.*;


class stackpush  extends zthreadnew implements Runnable
{
 
public void run()
{
if(top==10000)  
    System.out.println("The Stack is full");  
  else 
for(i=1;i<=10;i++)
{
   System.out.println("pushing");
   mystack[++top]= i;
}
}
}

class stackpop extends zthreadnew implements Runnable
{ 
public void run() 
{
if(top<0)  
      System.out.println("The Stack is Empty");            
  else 
{
for(i=1;i<=10;i++)
{
i= mystack[top--];
System.out.println("poping");
System.out.println(i);
}
}
}
}

class zthreadnew
{
int i;
int top= -1;
int mystack[]=new int[10000];
public static void main(String[] args)
{
stackpush pp= new stackpush();
stackpop po= new stackpop();
Thread p= new Thread(pp);
Thread o= new Thread(po);
p.start();
o.start();
 
}
}
