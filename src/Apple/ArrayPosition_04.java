package Apple;

public class ArrayPosition_04 {
	public static void main(String args[]) {
		int[] arr = {10,20,30,40,50};
		int elementToFind = 30;
		int position = -1;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]==elementToFind) {
				position = i;
				break;
			}
		}
		
				if (position != -1) {
					System.out.println("Element found at position: " + position);
				}else {
					System.out.println("Element not found in the array."); 
								
									
				}
			}

}
