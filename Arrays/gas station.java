class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int currgas=0;
        int startindex=0;
        int totcost=0;
        int totgas=0;
        for(int i=0;i<n;i++){
            totcost+=cost[i];
            totgas+=gas[i];
        }
        if(totcost>totgas){
            return -1;
        }
        for(int i=0;i<n;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                startindex=i+1;
                currgas=0;
            }
        }
        return startindex;
    }
}
