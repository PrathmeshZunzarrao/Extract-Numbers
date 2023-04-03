class ExtractNumbers  
{
	public static void main(String[] args) 
	{
		int n = 12345;

		do
		{
			int rem = n % 10;
			System.out.println(rem);
			
			n = n / 10;
		}
		while (n > 0);
	}
}
