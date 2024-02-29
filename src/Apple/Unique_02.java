package Apple;

public class Unique_02 {
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,3,5,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					//arr[j]=Integer.MAX_VALUE;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			//if(arr[i]<Integer.MAX_VALUE)
				if(arr[i]<Integer.MIN_VALUE)
				
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
}

