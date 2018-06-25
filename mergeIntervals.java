package codeing;

import java.awt.List;
import java.util.LinkedList;

public class MergeIntervals {
	private class Interval {
		int start;
		int end;
		Interval() { 
			start = 0; end = 0; 
		}
		Interval(int s, int e) { 
			start = s; end = e;
		}
	 }
	
	 public LinkedList<Interval> merge(LinkedList<Interval> intervals) {
         if (intervals.size() <= 1)
            return intervals;
    
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        LinkedList<Interval> mergedList = new LinkedList<Interval>();
        for(Interval interval: intervals) {
            if(mergedList.isEmpty()||mergedList.getLast().end<interval.start) {
                mergedList.add(interval);
            }
            else {
                mergedList.getLast().end = Math.max(mergedList.getLast().end, interval.end);
            }
        }
        return mergedList;
    }
	public static void main(String[] args) {
	}
}
