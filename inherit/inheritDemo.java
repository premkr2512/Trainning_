package inherit;
class car
{
    void Engine()
    {
    	System.out.println("This is Parent Type of Engine of hoursePower of "+1000); 
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
}
public class inheritDemo {
	public static void main(String [] args)
	{
        car x=new Audi(2000);
        x.Engine();
	}
}
