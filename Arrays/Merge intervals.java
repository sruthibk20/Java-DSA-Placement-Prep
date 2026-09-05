class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {

            int nextstart = intervals[i][0];
            int nextend = intervals[i][1];

            if (end >= nextstart) {
                end = Math.max(end, nextend);
            } 
            else {
                list.add(new int[]{start, end});
                start = nextstart;
                end = nextend;
            }
        }

        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }
}
