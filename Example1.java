class Example1
{
	private int i;
	Example1()
	{

	}

        Example1(int i)
	{ 
          this.i=i;
	}

	int getA()
	{
		return i;
	}
     void setA(int i)
	{
          this.i=i;
	}
	void methodA()
	{    
		
		System.out.println(i);
		i=10;
	}
	/*public static void main(String[] args) 
	{
		A a=new A();

		System.out.println(a.getA());
		a.methodA();
		*/
	
}
