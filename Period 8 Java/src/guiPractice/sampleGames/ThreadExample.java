package guiPractice.sampleGames;

public class ThreadExample implements Runnable{
	private int number;
	private int sleepTime;
	
	public static void main(String[] args){
		for(int i =1;i<=1;i++){
		Thread one = new Thread(new ThreadExample(1));
		Thread two = new Thread(new ThreadExample(2));
		Thread three = new Thread(new ThreadExample(3));;
		one.start();
		two.start();
		three.start();
		}
	
	
	
	}
	
	public ThreadExample(int x) {
		number = x;
		sleepTime = (int) (1000*Math.random());
	}

	@Override
	public void run() {
		System.out.println("Thread #"+number+"preparing to sleep for "+sleepTime+"ms.");
		try {
			Thread.sleep(sleepTime);
			System.out.println("Thread #"+number+" is woke.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
