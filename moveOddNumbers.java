import java.util.Arrays;
public class Sol{
  public void moveOddNumbers(int[] nums){
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
    sol.moveOddNumber(nums);
    System.out.println(Arrays.toString(nums));
  }
}
