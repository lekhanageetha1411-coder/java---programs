import java.util.Arrays; // it is necessary to print array the line Arrays.toString(nums), to sort an array Arrays.sort(array), to find array length Arrays.equals(ar1,ar2) and also to copy an array
public class Solution{
  public void moveZeros(int[] nums){
    int n = nums.length;
    int[] result = new int[n];
    int j=0;
    for(int i = 0;i<n;i++){
      if(nums[i] != o){
        result[j]=nums[i];
        j++;
      }
    }
    for(;j<n;j++){
      result[j]=0;
    }
    System.arraycopy(result,0,nums,0,n);
  }
  public static void main(String[] args){
    Solution sol = new Solution();
    int[] nums = {1,0,2,0,4,0,5};
    sol.moveZeros(nums);
    System.out.println(Arrays.toString(nums));
  }
}
