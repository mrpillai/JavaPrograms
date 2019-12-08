package concurrency;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Simple Java Program to show how to execute threads in a particular order. You
 * can enforce ordering or execution sequence using Thread.join() method in
 * Java.
 *
 * @author Javin Paul
 */
public class JoinDemo {

/*    private static class ParallelTask implements Callable<String> {
       // private Thread predecessor;

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Started");

            if (predecessor != null) {
               
                try {
                    predecessor.join();
                   
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + " Finished");
        }

        public void setPredecessor(Thread t) {
            this.predecessor = t;
        }

		@Override
		public String call() throws Exception {

            System.out.println(Thread.currentThread().getName() + " Started");
            System.out.println(Thread.currentThread().getName() + " Running");
            System.out.println(Thread.currentThread().getName() + " Finished");

           // Thread.sleep(10000);

			return "ello";
		}

    }*/

	  private static class ParallelTask implements Runnable {
	       // private Thread predecessor;

/*	        @Override
	        public void run() {
	            System.out.println(Thread.currentThread().getName() + " Started");

	            if (predecessor != null) {
	               
	                try {
	                    predecessor.join();
	                   
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }

	            System.out.println(Thread.currentThread().getName() + " Finished");
	        }*/

	     /*   public void setPredecessor(Thread t) {
	            this.predecessor = t;
	        }*/

			@Override
			public void run() {

				System.out.println("---------------------------------------------");
	            System.out.println(Thread.currentThread().getName() + " Started");
	            System.out.println(Thread.currentThread().getName() + " Running");
	            System.out.println(Thread.currentThread().getName() + " Finished");
				System.out.println("---------------------------------------------");

	           // Thread.sleep(10000);
	            
	          
	           

				
			}

	    }
    public static void main(String[] args) {

        // we have three threads and we need to run in the
        // order T1, T2 and T3 i.e. T1 should start first
        // and T3 should start last.
        // You can enforce this ordering using join() method
        // but join method must be called from run() method
        // because the thread which will execute run() method
        // will wait for thread on which join is called.

       /* ParallelTask task1 = new ParallelTask();
        ParallelTask task2 = new ParallelTask();
        ParallelTask task3 = new ParallelTask();*/
    	
    	
      /*  ExecutorService executor = Executors.newFixedThreadPool(1);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable = new ParallelTask();
*/
        
        
    /*    Future<String> future = executor.submit(callable);
        
        list.add(future);*/
        
        /*for(int i=0; i< 4; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        
        
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
        */
    	
         
  /*      ParallelTask task2 = new ParallelTask();
        ParallelTask task3 = new ParallelTask();*/
    	
    	Thread[] t =  new Thread[4] ;
    	ParallelTask task = new ParallelTask();
        
        for(int i=0; i<4;i++){
        	
        	
        	 t[i] = new Thread(task, "Thread - "+i);
        	 
        	 t[i].start();
        	 
	        /*    try {
					t[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
        }

     
        
        
  
     /*   task2.setPredecessor(t1);
        task3.setPredecessor(t2);

        // now, let's start all three threads
        t1.start();
        t2.start();
        t3.start();
        try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
    }



}
