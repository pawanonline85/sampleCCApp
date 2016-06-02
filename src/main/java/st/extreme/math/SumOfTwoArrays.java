package st.extreme.math;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int [] first={9,9,2};
		int [] sec={1,1,2};
		char [] result=sumOfTwoArrays(first,sec);
		System.out.println(result);
	}

	private static char[] sumOfTwoArrays(int[] first, int[] sec) {
		String finalResult="";
		for(int i=0;i<sec.length;i++){
			finalResult=finalResult+String.valueOf((first[i]+sec[i]));
		}
		return finalResult.toCharArray();
	}

}
