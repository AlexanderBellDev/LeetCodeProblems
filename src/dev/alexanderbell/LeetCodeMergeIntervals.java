package dev.alexanderbell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCodeMergeIntervals {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{new int[]{1, 4}, new int[]{10,20}, new int[]{5, 6}})));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Intervals[] intervalsList = new Intervals[intervals.length];
        ArrayList<Intervals> finalIntervalList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            intervalsList[i] =  new Intervals(intervals[i][0],intervals[i][1]);
        }

        Arrays.sort(intervals, (a,b) -> a[0] - b[1]);
        Arrays.sort(intervalsList);
        Intervals currentInterval = intervalsList[0];
        for (int i = 1; i < intervalsList.length; i++) {
                if(intervalsList[i].from <= currentInterval.to) {
                    currentInterval.to = Math.max(currentInterval.to, intervalsList[i].to);
                }else {
                    finalIntervalList.add(currentInterval);
                    currentInterval = intervalsList[i];
                }
        }
        finalIntervalList.add(currentInterval);
        int[][] finalList = new int[finalIntervalList.size()][2];
        for (int i = 0; i < finalIntervalList.size(); i++) {
            finalList[i][0] = finalIntervalList.get(i).from;
            finalList[i][1] = finalIntervalList.get(i).to;
        }
        return finalList;
    }

}
class Intervals implements Comparable<Intervals> {
    int from, to; // note: you should generally make these private :)
    public Intervals(int from, int to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public String toString() {
        return "[" + Integer.toString(from) + "," + Integer.toString(to) + "]";
    }

    @Override
    public int compareTo(Intervals o) {
        return this.from - o.from;
    }
}