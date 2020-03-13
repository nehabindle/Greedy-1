package jumpGame;

public class Solution {
	public boolean canJump(int[] nums) {
        if(nums==null || nums.length < 2){
            return true;
        }
        
        int destination = nums.length-1;
        
            for(int i=nums.length-2;i>=0;i--)
            {
                if(nums[i]+i >= destination)
                {
                    destination=i;
                }
            }
        return destination==0;
    }
	public static void main(String[] args) {
		
		int[] jumps = {2,3,1,1,4};
		Solution obj = new Solution();
		
		System.out.println(obj.canJump(jumps));
		
	}

}
