class Solution {

    class Pair{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Pair[] pairs = new Pair[n];    

        for(int i=0; i<nums.length; i++)
        pairs[i] = new Pair(nums[i],i);

        Arrays.sort(pairs,(p1,p2)->p1.val-p2.val);
        int lo = 0, hi = n-1;

        while(lo<hi){

            int sum = pairs[lo].val + pairs[hi].val;

            if(sum==target)
            return new int[]{pairs[lo].idx,pairs[hi].idx};

            else if(sum<target)
            lo++;

            else 
            hi--;
        }

        return new int[]{-1,-1};
    }
}