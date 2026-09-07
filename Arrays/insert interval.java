class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        int n = intervals.length;
        List<int[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(intervals[i][1]<newinterval[0]){
                list.add(intervals[i]);
            }
            else if(intervals[i][0]>newinterval[1]){
                list.add(newinterval);
                for(int j=i;j<n;j++){
                    list.add(intervals[j]);
                }
                return list.toArray(new int[list.size()][]);

            }
            else{
                newinterval[0]=Math.min(newinterval[0],intervals[i][0]);
                newinterval[1]=Math.max(newinterval[1],intervals[i][1]);
            }
        }
        list.add(newinterval);
        return list.toArray(new int[list.size()][]);
    }
}
