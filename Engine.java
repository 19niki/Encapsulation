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
	engine e=new engine(150);
	void drive()
			{
		e.enginedetails();
		System.out.println("car is getting started");
		
}
}

class Cardriver
{
	public static void main(String[] args)
	{
	car c1=new car("volovo");
	e.drive();
}
}