import java.util.Arrays;
class Solution{
  public void rotateArray(int[] nums, int k){
    int n = nums.length;
    int[] rotated = new int[n];
    k = k % n;
    for(int i = 0; i < n;i++){
      rotated[(i+k)%k] = nums[i];
    }
    for(int i = 0; i < n;i++){
      nums[i] = rotated[i];
    }
  }

  public static void main(String[] args){
      int[] nums = {1,2,3,4,5,6};
      int k = 3;
      Solution sol = new Solution();
       sol.rotateArray(nums, k);
      System.out.println(Arrays.toString(nums));
  }
}
                          
