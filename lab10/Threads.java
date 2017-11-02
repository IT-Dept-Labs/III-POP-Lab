class RunnableThread implements Runnable{
	public void run(){

		System.out.println("Thread:"+Thread.currentThread().getName());
		try{
		Thread.sleep(10);
		}
		catch (InterruptedException e) {
			System.out.println("Exception: "+e);
		}

	}
}
public class Threads{
	public static void main(String[] args) {
		Thread timer1=new Thread(new RunnableThread());
		System.out.println("Background Thread Running");
		timer1.start();
		Thread timer2=new Thread(new RunnableThread());
		timer2.start();
	}
}