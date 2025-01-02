class ArrayIndex
{
	public static void main(String[] args)
	{
		int[] arr={2,45,5,7,6};
		int target=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==target-arr[j])
				{
					System.out.println("element of inex is ["+i+","+j);
				}
			}
		}
	}
}