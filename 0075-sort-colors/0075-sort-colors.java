class Solution {

    private void swap(int[] nums, int i, int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        
        int i = 0, j = 0, k = nums.length-1;

        while(i<=k){

            if(nums[i]==1)
            i++;

            else if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }

            else{
                swap(nums,i,k);
                k--;
            }
        }
    }
}