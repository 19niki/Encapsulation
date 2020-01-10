class Ex3 
{
	void hello()
	{
		Example1 e=new Example1(45);
		System.out.println("i:" + e.getA());
		//e.i=78;
		e.setA(789);
		System.out.println("i:" +e.getA());
	}
	public static void main(String[] args)
  {
	Ex3 ex=new Ex3();
	ex.hello();
		
	}
}
