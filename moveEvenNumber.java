import java.util.Arrays;
public class Solution{
  public void moveEvenNumber(int[] nums){
    int n = nums.length;
    int left = 0;
    int right = n-1;
// left has to be less than rigth because left= 0 , right = n-1, n=6, n-1 = 5 we have do the iteration till the condition satisfies
  while(left<right){
    // if condition here from our array nums[left] = nums[0]= 1 %2 ==0 false
    if(nums[left] %2 == 0){
      left++;
    }
      // nums[right] , nums[4] = 6%2 == 0 so that 
    else if(nums[right] %2 != 0){
      right--;
    }
      // we have to swap the left and right because it is false 
    else{
      
      int temp = nums[left];    // temp = nums[left] = 1
      nums[left] = nums[right];   // nums[left] = nums[rigth] , nums[left] = 6;
      nums[right] = temp;          // nums[rigth] = temp , temp = 1 so right = 1 
      left++;
      right--;
    }
  }
  }
  public static void main(String[] args){
    Solution sol = new Solution();
    int[] nums = {1,2,3,4,5,6};
    sol.moveEvenNumber(nums);
    System.out.println(Arrays.toString(nums));
  }
}
  
// another methods
import java.util.Arrays;
public class Sol{
  public void moveEvenNumbers(int[] nums){
    int n = nums.length;
    int[] result = new int[n];
    int j = 0;
    for(int i = 0; i<n;i++){
      if(nums[i] %2 != 0){
        result[j] = nums[i];
        j++;
        
      }
    }
    for(int i = 0;i<n;i++){
      if(nums[i] %2 == 0){
        result[j] = result[i];
        j++;
      }
    }
    System.arraycopy(result,0,nums,0,n);
  }
  public static void main(String[] args){
    Solution sol = new Solution();
    int[] nums = {1,2,3,4,5,6};
    sol.moveEvenNumber(nums);
    System.out.println(Arrays.toString(nums));
  }
}
