import java.util.concurrent.*;

public class CreateTest 
{

	static class MyThread extends Thread 
	{

		String name = "";

		MyThread(String name) 
		{
			this.name = name;
		}

		public void run() 
		{

			try 
			{
	
				try 
				{

					for (int i = 1; i <= 5; i++) 
					{
						System.out.println(" Meu nome é: " + name);
						Thread.sleep(1000);
					}

				}

			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) 
	{

		MyThread t1 = new MyThread("Raffael");
		t1.start();

		MyThread t2 = new MyThread("Pedro");
		t2.start();

	}
}
