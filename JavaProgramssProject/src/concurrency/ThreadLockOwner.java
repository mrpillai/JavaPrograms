package concurrency;
/*package com.mridu.microservices.limitsservice;

import java.util.concurrent.locks.*;  
  
public class ThreadLockOwner  {  
   
   public static void main(String args[]) throws InterruptedException {  
       ReentrantLockClass2 lock1 = new ReentrantLockClass2();  
       ReentrantLockClass2 lock2 = new ReentrantLockClass2();  
      MyThread1 thrd1 = new MyThread1(lock1, lock2);  
      MyThread1 thrd2 = new MyThread1(lock1, lock2);  
      thrd1.start();  
      thrd1.join();  
      thrd2.start();  
      thrd2.join();  
   }  
}  
   
class MyThread1 extends Thread {  
   
    ReentrantLockClass2 lock1;  
    ReentrantLockClass2 lock2;  
   
   MyThread1(ReentrantLockClass2 lock1, ReentrantLockClass2 lock2){  
      this.lock1=lock1;  
      this.lock2=lock2;  
   }  
   
   public void run() {  
      if ( ! lock1.tryLock()) {  
         lock2.tryLock();  
      }   
      System.out.println(this.getName() + ": lock1 owner: " + lock1.owner());  
      System.out.println(this.getName() + ": lock2 owner: " + lock2.owner());  
   }  
}  
   
class ReentrantLockClass2 extends ReentrantLock {  
   String owner() {  
      Thread t =  this.getOwner();  
      if (t != null) {  
         return t.getName();  
      } else {  
         return "none";  
      }  
   }  
}  */