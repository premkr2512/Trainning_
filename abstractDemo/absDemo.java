package abstractDemo;

abstract class car
{
	
     abstract void Engine();
     void Engine2()
     {
    	 System.out.println("dvd");
     }
     }
class BMW extends car
{
	int HoursePowerBMW;
	BMW(int hoursepower)
	{
		this.HoursePowerBMW=hoursepower;
	}
    void Engine()
    {
    	System.out.println("This is Parent Type of Engine of hoursePower of "+HoursePowerBMW); 	
    }
    void Engine2()
    {
   	 System.out.println("This is also also Parent Type of Engine of hoursePower of "+HoursePowerBMW);
    }
}
class Audi extends car
{
	int HoursePowerAudi;
	Audi(int hoursepower)
	{
		this.HoursePowerAudi=hoursepower;
	}
    void Engine()
    {
    	System.out.println("This is Parent Type of Engine of hoursePower of "+HoursePowerAudi); 	
    }
    void Engine2()
    {
   	 System.out.println("This is also also Parent Type of Engine of hoursePower of "+HoursePowerAudi);
    }
}
public class absDemo {
	public static void main(String [] args)
	{
        car x=new Audi(2000);
        x.Engine();
        x.Engine2();
	}
}
