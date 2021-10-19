class prime
{
 	public static  boolean isprime(int n)
	{
	int count=0;
	
	for(int i=1;i<=n;i++)
	{
	 if(n%i==0)
	{
	count++;
	}
	}
	if(count==2)
	{
	return true;
	}
	else{
	return false;
	}


	}



	public static void main(String arg[])
	{
	for(i=1;i<=1000;i++)
	{
	boolean ans=isprime(i);
	if(ans==true)
	{
	System.out.print(i+"\t");
	}
	}
	}

}
