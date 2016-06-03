package st.extreme.math;

import java.util.Arrays;

public class BalancedArray {
//Check if the array is balanced or not
	
	public static void main(String[] args) {

		//int []input={2,3,3,3,11};
		//int []input={1,5,5,11};
		//int []input={3,1,1,2,2,1};
		int []input={87,56,43,91,27,65,59,36,32,51,37,28,75,7,74 };
		//7,27,28,32,36,37,43,51,56,59,65,74,75,87,91
		
		Arrays.sort(input);
		
		System.out.println(balancedArray(input));
		
	}

	private static boolean balancedArray(int[] input) {
		int arrSum=0;
		for(int i=0;i<input.length;i++){
			arrSum=arrSum+input[i];
		}
		int intial=0;
		for(int j=0;j<input.length;j++){
			
			intial=intial+input[j];
			if(intial==arrSum-intial){
			return true;
			}
			
		}
		return false;
	}

}
