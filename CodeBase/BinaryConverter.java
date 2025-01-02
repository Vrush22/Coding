class BinaryConverter
{
	public static void main(String[] args)
	{
		int num=10;
		int a;
		int rev=0;
		int result=0;
		int i=1;
		while(num !=0)
		{
			a=num%2;
			num=num/2;
			//System.out.println(a);
			result=result+a*i;
			i=i*10;
						
		}
		System.out.println(result);
	}
}