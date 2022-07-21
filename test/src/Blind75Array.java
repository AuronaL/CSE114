import java.util.*;

public class Blind75Array {
    public static void main(String[] args) {
        //two sum
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        //Best Time to Buy and Sell Stock
        System.out.println( maxProfit(new int[]{7,1,5,3,6,4}));
        //Contains Duplicate
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
            //Input: nums = [1,2,3,1] Output: true;  Input: nums = [1,2,3,4]  Output: false; Input: nums = [1,1,1,3,3,4,3,2,4,2] true
        //productExceptSelf
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4}))); //[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));//[0,0,9,0,0]
        //53. Maximum Subarray
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); //Explanation: [4,-1,2,1] has the largest sum = 6.
        System.out.println(maxSubArray(new int[]{1}));//1
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));//23
        System.out.println(maxSubArray(new int[]{-2,-1}));//-1
        //153. Find Minimum in Rotated Sorted Array
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
        System.out.println(findMin(new int[]{2,1}));
    }

    //2022.6.1 Array
//    public static int[] twoSum(int[] nums, int target) {
//        int[] find = {-1,-1};
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if( nums[i]+nums[j]==target ) { find = new int[]{i, j}; return find;}
//            }
//        }
//        return find
//    }
    //2022.6.8
    public static int maxProfit(int[] prices) {
        int profit =0, min=prices[0];
        for(int i=1; i<prices.length; i++){
            //buy at one day and sell it in the FUTURE
           if(prices[i]-min>profit) profit=prices[i]-min;
           if (min>prices[i]) min=prices[i];
        }
        return profit;
    }
    //rewrite
//    public static int[] twoSum(int[] num, int target) {
//        HashMap<Integer,Integer> numMap =new HashMap<>();int[] find = new int[0];
//        for(int i=0; i<num.length ;i++){
//            numMap.put(num[i],i);
//        }
//        for(int i=0; i<num.length ;i++){
//            // if it is the same, then no
//            if( numMap.containsKey(target-num[i])&& numMap.get(target-num[i])!=i){ find = new int[]{Math.min(i, numMap.get(target-num[i])), Math.max(i, numMap.get(target-num[i]))};}
//        }
//        return find;
//    }
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int[] toReturn = new int[]{indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
    //6.12.2022
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);// must sort first otherwise runtime error!!
//        ArrayList<Integer> countNum= new ArrayList<>();
//        for(int num: nums) {
//            if(!countNum.contains(num)){
//                countNum.add(num);
//            }else return true;
//        }
//        return false;
//    }
        //better with hashset as it is faster because hashset doesn't have a duplicate value, and it doesn't need to create a new arraylist again
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> flag = new HashSet<>();
        for(int i : nums) {
            if(!flag.add(i)) {
                return true;
            }
        }
        return false;
    }

    //2022/7/1
    // Product of Array Except Self
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0]=1; int right =1;
        // ( int i: nums ) foreach is element not index
       for(int i= 1; i<nums.length; i++){
           output[i]=output[i-1]*nums[i-1];
       }
       for(int i=nums.length-1; i>=0; i--){
           output[i] *= right;
           right *= nums[i];
       }
        return output;
    }

    // 7/3/2022
    // 53. Maximum Subarray -> one negative number + multiple positive numbers(part)
    // Kadane's algorithm
    public static int maxSubArray(int[] nums) {
        int maxSum=nums[0], currentArray =nums[0];
        for(int i =1; i< nums.length; i++){
            currentArray = Math.max(nums[i], currentArray+nums[i]);
            // as long as current array is positive, add new element otherwise start a new array
            maxSum = Math.max(maxSum, currentArray);
        }
       return maxSum;
    }

    //153. Find Minimum in Rotated Sorted Array
    // right and left pointer -> mid
    public static int findMin(int[] nums) {
        if (nums.length==1) return nums[0];
        int left =0, right = nums.length-1;
        // if the last element is greater than the first element then there is no rotation.
        // e.g. 1 < 2 < 3 < 4 < 5 < 7. Already sorted array.
        // Hence the smallest element is first element. A[0]
        if(nums[right]>nums[left]) {
            return nums[0];
        }
        while(right>=left){
            int mid = left+(right-left)/2;
            // if the mid element is greater than its next element then mid+1 element is the smallest
            // This point would be the point of change. From higher to lower value.
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(nums[mid-1]>nums[mid]) return nums[mid];
            //else
            // if the mid elements value is greater than the 0th element this means
            // the least value is still somewhere to the right as we are still dealing with elements greater than nums[0]
            if(nums[mid]>nums[0]) left = mid+1;
            else right = mid-1;
           }
       return Integer.MAX_VALUE;
    }

    //7/19/2022
    //33. Search in Rotated Sorted Array
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        // left & right pointer -> mid
        while(left<=right){
            int midIndex = (left+right)/2;
            if (nums[midIndex]==target)
                return midIndex;
            if (nums[midIndex]>target)
                right =midIndex;
            if (nums[midIndex]<target)
                left =midIndex;
        }
        return -1;

    }
}

