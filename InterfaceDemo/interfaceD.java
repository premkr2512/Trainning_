package InterfaceDemo;

interface car
{
     void Engine();
}
class BMW implements car
{
	int HoursePowerBMW;
	BMW(int hoursepower)
	{
		this.HoursePowerBMW=hoursepower;
	}
    public void Engine()
    {
    	System.out.println("This is Parent Type of Engine of hoursePower of "+HoursePowerBMW); 	
    }
}
class Audi implements car
{
	int HoursePowerAudi;
	Audi(int hoursepower)
	{
		this.HoursePowerAudi=hoursepower;
	}
    public void Engine()
    {
    	System.out.println("This is Parent Type of Engine of hoursePower of "+HoursePowerAudi); 	
    }
}
public class interfaceD {
	public static void main(String [] args)
	{
        car x=new Audi(2000);
        x.Engine();
	}
}
