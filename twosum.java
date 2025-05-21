import java.util.HashMap;

class twosum {
    public static int[] twoSum(int[] nums, int target) 
    {
        // Create a HashMap to store the number and its index
       HashMap<Integer, Integer> map = new HashMap<>();
        
       for ( int i = 0 ; i < nums.length ; i++)
       {
        // Calculate the complement
        int complement = target - nums[i];
        // Check if the complement exists in the HashMap
        if (map.containsKey(complement)) {
            // Return the indices of the complement and current number
            return new int[] {map.get(complement), i};
        }
        // Add the current number and its index to the HashMap
        map.put(nums[i], i);   
       }
        // Throw an exception if no solution exists (this shouldn't happen as per constraints)
       throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args)
    {
        int[] test = {1,7,11,2};
        int result[] = twoSum(test,9);
        for(int i = 0 ; i < result.length ; i ++)
           System.out.println("Value is "+result[i]);
    }
}