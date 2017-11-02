class RunnableThread extends Thread{
		public void run(){
			System.out.println("Thread is running...");
		}
}
public class ThreadExtend {
	public static void main(String[] args) {
	RunnableThread thread1=new RunnableThread();
	thread1.start();
	}
}