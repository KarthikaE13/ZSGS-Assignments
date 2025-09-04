package day_12;

public class Mythread extends Thread {
	public Mythread(String name) {
		super(name);
	}

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
	Mythread t1 = new  Mythread("thread-1");
	
	Mythread t2 = new  Mythread("thread-2");
	t1.start();
	t2.start();
	
	}

}
