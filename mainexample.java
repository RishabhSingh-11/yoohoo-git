class mainexample
{
	public static void main(String args[])
	{
	System.out.println("program started now going to call method");
	avg ob=new avg();
	ob.sayhello();
	ob.dosum(40,63);
	ob.dosum(100,200);
	ob.dosum(343,3434);


	double ans=ob.findavg(2,5,9);
	System.out.println(ans+5);

	}


}