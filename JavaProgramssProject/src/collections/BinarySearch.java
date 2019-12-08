package collections;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

import concurrency.ForkJoinSearcher;
public class BinarySearch {
       int[] arr = new int[100];
       public BinarySearch()
           {
              init();
           }
       private void init()
       
       {
       System.out.println("Arr:"+arr.length);
    	   for(int i =0 ; i<arr.length;i++)
              {
                     arr[i] = i;
                     System.out.println("Arr Elem"+arr[i]);

              }             
              Arrays.sort(arr);
              System.out.println("Arr Elem"+arr);
       }      
       public void createForJoinPool(int search)
       {
              ForkJoinPool forkJoinPool = new ForkJoinPool(50);
              ForkJoinSearcher searcher = new ForkJoinSearcher(this.arr,search);
              Boolean status = forkJoinPool.invoke(searcher);             
              System.out.println(" Element ::" + search +" has been found in array? :: " + status );             
       }
       public static void main(String[] args) {
    	   
              BinarySearch search = new BinarySearch();
              search.createForJoinPool(5);
              System.out.println("**********************");
              search.createForJoinPool(104);             
       }
}