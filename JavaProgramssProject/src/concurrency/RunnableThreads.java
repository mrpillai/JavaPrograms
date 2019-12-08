package concurrency;

class Tassk implements Runnable {

	public void run() {
		System.out.println("Run ()");
	}
}

public class RunnableThreads {

	public static void main(String args[]) {

		Tassk tassk = new Tassk();
		
		Thread t = new Thread(tassk);
		
		t.start();
		
		
	}

}
