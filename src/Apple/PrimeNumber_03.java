package Apple;

public class PrimeNumber_03 {
	public static void main(String[] args) {
		int num=16;
		int count=0;
		if(num<2)
		{
			System.out.println("Not prime");
		
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				
			}
		}
		if(count<=2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

}
