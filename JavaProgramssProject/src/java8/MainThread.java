/**
 * 
 */
package java8;

/**
 * @author mrpillai
 *
 */
public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// new thread obj

		new Thread(new RThread()).start();

		// Anonymous Runnable class
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In Anonymous Thread run ()");
				System.out.println(Thread.currentThread().getName());

			}
		}).start();

		// Java 8
		new Thread(() -> {
			System.out.println("In Java8 Lambada Thread run ()");
			System.out.println(Thread.currentThread().getName());
		}).start();

		// Creating runnable & thread objects
		RThread rThread = new RThread();
		Thread t = new Thread(rThread);
		t.start();

		// By Extending a class to Thread class
		TThread tThread = new TThread();
		tThread.start();

	}

}

class RThread implements Runnable {

	@Override
	public void run() {

		System.out.println("In RThread run ()");
		System.out.println(Thread.currentThread().getName());

	}
}

class TThread extends Thread {

	public void run() {
		System.out.println("In TThread run ()");
		System.out.println(Thread.currentThread().getName());

	}

}
