class A 
{
	private int i;

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
		i=10;
		System.out.println(i);
		
	}
	public static void main(String[] args) 
	{
		A a=new A();

		System.out.println(a.getA());
		a.methodA();
	}
}
