class divisible
{
	public void finddivi(int x)
	{
	if(x%2==0 && x%3==0)
	{
	System.out.println("divisible");
	}
	else
	{
	System.out.println("not divisible");
	}
	}

}


class check
{
	public static void main(String arg[])
	{
	divisible a=new divisible();
	a.finddivi(6);
	}
}