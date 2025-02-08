class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(i1,i2)->i1[0]-i2[0]);

        ArrayList<int[]> list = new ArrayList<>();
        int[] interval = intervals[0];
        list.add(interval);

        for(int i=1; i<intervals.length; i++){

            int[] currInterval = intervals[i];

            if(currInterval[0]<=interval[1]){
                interval[0] = Math.min(interval[0],currInterval[0]);
                interval[1] = Math.max(interval[1],currInterval[1]);
            }

            else{
                list.add(currInterval);
                interval = currInterval;
            }
        }

        int[][] res = new int[list.size()][];
        int idx = 0;

        for(int[] arr : list)
        res[idx++] = arr;

        return res;
    }
}