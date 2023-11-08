package day17;

import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>((a,b)->(b-a));
        maxHeap = new PriorityQueue<>((a,b)->(a-b));
    }

    public void addNum(int num) {
        if(minHeap.isEmpty()||num<= minHeap.peek()){
            minHeap.offer(num);
            if(minHeap.size()-1>maxHeap.size()){
                maxHeap.offer(minHeap.poll());
            }
        }else {
            maxHeap.offer(num);
            if(maxHeap.size()>minHeap.size()){
                minHeap.offer(maxHeap.poll());
            }
        }

    }

    public double findMedian() {
        if(minHeap.size()>maxHeap.size()){
            return minHeap.peek();
        }
        return (minHeap.peek()+maxHeap.peek())/2.0;
    }
}
