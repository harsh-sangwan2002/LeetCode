class Solution {

    private void swap(int[] arr, int lo, int hi) {
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }

    private void reverse(int[] arr, int lo, int hi) {
        while (lo <= hi) {
            swap(arr, lo, hi);
            lo++;
            hi--;
        }
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        if (n == 1) return;

        int k = n - 2;
        while (k >= 0 && nums[k] >= nums[k + 1]) { 
            k--;
        }

        if(k<0){
            reverse(nums,0,n-1);
            return;
        }

        int idx = n-1;
        while(idx>=0 && nums[idx]<=nums[k])
        idx--;
        
        swap(nums,k,idx);
        reverse(nums,k+1,n-1);
    }
}