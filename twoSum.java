import java.util.Arrays;
public class twoSum{
  public static int[] toSum(int[] nums,int target){     // method with parameters without static output will print an error
    for(int i = 0; i < nums.length; i++){       //i=0,i<4;i++
      for(int j = i +1; j < nums.length; j++){ //j=0+1;j<4j++
        if(nums[i] + nums[j] == target){       //nums[0]+nums[1] == 9;
          return new int[]{i,j};                // 2 + 7 = 9 true
        }                                       //return indices of sum of two values so that it contains two elements i j so that it's an array []
      }
    }
    return new int[]{-1,-1};
  }
  public static void main(String[] args{
    int[] nums = {2,7,12,45};
    int target = 9;
    int result = toSum(nums,target);
    System.out.println(Arrays.toString(result));
}
