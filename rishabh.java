class avg
{
	//without argument and void return
	public void sayhello()
	{
	
	System.out.println("hey, i am say hello method of class avg");
	}
	
	//with argument,void return type 
	
	public void dosum(int x,int y)
	{
	int c=x+y;
	System.out.println("sum is"+c);

	}
	//with argument and return value also

	public double findavg(int x,int y,int z)
	{

	double answer= (x+y+z)/3.0;
	return answer;
	}

}