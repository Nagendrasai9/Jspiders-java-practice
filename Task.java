class Task 
{
	public static void main(String[] args) 
	{
		double per=65;
		int yop=2023;
		String stream="CSE";
		String Bond="YES";
		if(per>=65)
		{
			if(yop>=2020 && yop<=2024)
			{
				if(stream=="ECE" || stream=="CSE" || stream=="EEE" || stream=="IT")
				{
					if(Bond=="YES")
					{
						System.out.println("Eligible");
					}
					else
					{
						System.out.println("Not Eligible check Bond");
					}
				}
				else
				{
					System.out.println("Not Eligible check stream");
				}
			}
			else
			{
				System.out.println("Not Eligible check yop");
			}
		}
		else
		{
			System.out.println("Not Eligible check Per");
		}
	}
}
