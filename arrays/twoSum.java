package arrays;
// https://leetcode.com/problems/two-sum/



import java.util.HashMap;

class SolutionTS {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dictionary = new HashMap <Integer, Integer>();
        for (int i =0 ; i<= nums.length-1; i++){
            if (dictionary.containsKey(nums[i])) {
                return new int[] {dictionary.get(nums[i]), i};
            }else{
                dictionary.put(target-nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}

class twoSum{
    public static void main(String[] args){
        SolutionTS solution = new SolutionTS();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.print(result[0]+ " ");
        System.out.println(result[1]);
    }
}