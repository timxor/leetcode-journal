/*
Queue.java

https://prismoskills.appspot.com/lessons/Algorithms/Chapter_03_-_Queue_Dequeue_and_Priority_Queue.jsp

Queue, Dequeue and Priority Queue

Queue is a list where insertion is done at one end and removal is done at the other end.

Dequeue is a list where every end supports insertion and removal.
With this feature, it is possible to use the dequeue as a list and a stack at the same time as required by the application.

Priority queue does not have any ends.
In a priority queue, elements can be inserted in any order but removal of the elements is in a sorted order.
Due to this behavior, a priority queue can be used to sort the elements.

Since sorting is done only when the elements are removed from the priority queue, the PQ is easily implemented by a heap.
Using an array-based heap, elements can be inserted and deleted in O(logN).


java.util package provides implementations for all of the above.



Order Analysis:
The above code to select top 'K' elements from 'N' elements runs in O(N log K) time.
If K is sufficiently small as compared to N, then it becomes effectively O(N)


Code to get top 'K' elements from 'N' elements:

*/

import java.util.PriorityQueue;

public class PriorityQueueTest {


    public static PriorityQueue<Integer> getTopK (int[] arr, int k)
    {
        PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();

        // Put first k elements into the queue
        for(int i = 0; i < k; i++)
            minQ.add(new Integer(arr[i]));


        // Iterate over the remaining array.
        // If anything larger than the minimum of priority queue is seen,
        // then remove the minimum and add the new one
        for(int i = k; i < arr.length; i++)
        {
            Integer minValue = minQ.peek();

            if(arr[i] > minValue.intValue())
            {
                minQ.poll(); // remove the minimum
                minQ.add(new Integer(arr[i])); // add the larger
            }
        }

        return minQ; // return top K elements
    }


    // Function to test the above function
    public static void main(String[] args)
    {
        int N = 100000;
        int k = 1000;

        int arr[] = new int[N];

        for (int i=0; i<N; i++)
            arr[i] = (int)(Math.random()*N*3);

        PriorityQueue<Integer> topK = getTopK (arr, k);


        for (int i : arr)
            System.out.print(i+", ");
        System.out.println();

        for (int i=0; i<k; i++)
            System.out.print(topK.poll()+", ");
    }
}
