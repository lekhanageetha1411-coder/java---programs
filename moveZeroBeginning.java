import java.util.Arrays;
class Sol{
  public void moveZero(int[] nums){
    int left = 0;
    int right = nums.length-1;

  while(left<right){
    if(nums[left] == 0){
      left++;
    }
    else if(nums[right] != 0){
      right--;
    } else{
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
  }
  public static void main(String[] args){
    Sol sol = new Sol();
    int[] nums = {1,0,0,5,0,7,0,9};
    sol.moveZero(nums);
    System.out.println(Arrays.toString(nums));
    }
