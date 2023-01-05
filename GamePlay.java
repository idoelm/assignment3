//Ido Elmakies 316476340
package assig3_1;

public class GamePlay 
{
	private boolean coin_available;
	private int rounds_counter;
	
	public GamePlay()
	{
		this.coin_available = false;
		this.rounds_counter = 0;
	}
	
	public void makeCoinAvail(boolean val)
	{
		synchronized (this) 
		{
			this.coin_available = val;
			if(this.coin_available == true)
			{
				this.notifyAll();
			}
		}
	
	}
	
	public int flipCoin() throws InterruptedException
	{
		synchronized (this) 
			{
			while(!this.coin_available)
			{
				System.out.println(Thread.currentThread().getName() + " is waiting for coin");
				this.wait();
			
			}
		    System.out.println(Thread.currentThread().getName() + " is flipping coin");
		    this.makeCoinAvail(false);
			this.rounds_counter++;
			
		}
		this.makeCoinAvail(true);
		return (int) Math.round( Math.random());
	}
	
	public int getNumOfRounds()
	{
		return this.rounds_counter;
	}
}
