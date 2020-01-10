class Engine 
{
	double cc;
	Engine()
	{

	}

 Engine(double cc)
	{
	 this.cc=cc;
	}
	double getCC()
	{
       return cc;
	}
	void setCC(double cc)
	{
		this.cc=cc;
	}

		void enginedetails()
	{
			System.out.println("engine is getting started");
	}
}
class car
		{
	String name;
	car()
			{
			}
			car(String name)
			{
				this.name=name;
			}
			String getName()
			{
				return name;
			}
			void setName(String name)
			{
                  this.name=name;
			}
	
	void drive()
			{
		Engine e=new Engine(150);
		e.enginedetails();
		System.out.println("car is getting started");
		System.out.println(e.getCC());
		
}
}

class Cardriver
{
	public static void main(String[] args)
	{
	car c1=new car("volovo");
	c1.drive();
	c1.setName("BMW");
System.out.println(c1.getName());
}
}