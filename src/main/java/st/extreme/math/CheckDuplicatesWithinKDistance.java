package st.extreme.math;
import java.util.*;

class CheckDuplicatesWithinKDistance
{
    static boolean checkDuplicatesWithinKDistance(int arr[], int k)
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found 
            // a duplicate within k distance
            if (set.contains(arr[i]))
               return true;
 
            // Add this item to hashset
            set.add(arr[i]);
 
            // Remove the k+1 distant item
            if (i >= k)
              set.remove(arr[i-k]);
        }
        return false;
    }
 
    
    
    public static void main(String[] args) {
		int input,distance ;
		 
		Scanner    sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        // One by one run for all input test cases
        while (t > 0)
        {
        	distance = sc.nextInt();
                input = sc.nextInt();
                // Compute and print result
                
                
                int arr[] =new int[input];
                
                for(int i=0;i<arr.length;i++)
                	arr[i]=sc.nextInt();
                
                if (checkDuplicatesWithinKDistance(arr, distance))
                    System.out.println("True");
                 else
                    System.out.println("False");
 
            t--;
        }

	}
}
