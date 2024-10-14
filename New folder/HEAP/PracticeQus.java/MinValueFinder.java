import java.util.PriorityQueue;

public class MinValueFinder {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 6};
        int result = findMinValue(array);
        System.out.println("The final minimum value is: " + result);
    }

    public static int findMinValue(int[] arr) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        

        for (int num : arr) {
            minHeap.add(num);
        }
        
        
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            
            int newElement = first + second;
            minHeap.add(newElement);
        }
        
   
        return minHeap.poll();
    }
}
