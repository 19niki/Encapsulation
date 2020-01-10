class Bank
{
	private int ac_no;
	private String name;
    private int bal;
	Bank()
	{

	}
     Bank(int ac_no,String name,int bal)
	{
          this.ac_no=ac_no;
		  this.name=name;
		  this.bal=bal;
	}

    int getbal() 
	{
		return bal;
	}
	void setBal()
	{
		 this.bal=bal;
		 
	}

	public static void main(String[] args) 
	{
	   Bank b=new Bank();
	   b.bal=100;
	   System.out.println(b.getbal());
	   b.bal=500;
       System.out.println(b.getbal());
	   }
}
