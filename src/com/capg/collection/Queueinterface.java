package com.capg.collection;

import java.util.PriorityQueue;

public class Queueinterface
{
 public static void main(String[] args)
 {
	 PriorityQueue queue=new PriorityQueue();
	 queue.add(new String("Adhya"));  
	 queue.add("Vijay");  
	 queue.add("Karan");  
	 queue.add("Jai");  
	 queue.add("Rahul");  
	 System.out.println(queue);
	 System.out.println(queue.hashCode());
	 System.out.println(queue.size());
	 
	 System.out.println(queue.peek());
	 
     System.out.println(queue.isEmpty());
     System.out.println(queue.size());
     System.out.println(queue.getClass());
     System.out.println(queue.iterator());
     System.out.println(queue.poll());
     System.out.println(queue.remove());
 }
}
// Difference 