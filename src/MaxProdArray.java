
public class MaxProdArray {
	
	public static void main(String[] args) {
		int [] inputArray = {3,6,8,9,-1,-5,7,3,80,100};
		int maxProduct = inputArray[0] * inputArray[1];
		
		for (int i=0; i< inputArray.length-1; i++)
			{
				if(maxProduct < inputArray[i] * inputArray[i+1])
				{
					maxProduct = inputArray[i] * inputArray[i+1];
					
				}
			
		}
		System.out.println(maxProduct);
		
		
	}

	
	
}
