//Ido Elmakies 316476340
package assig3_1;

public class Gamer 
{
	private int goodFlipsCounter;
	private GamePlay g;
	
	public Gamer(GamePlay Myg)
	{
		this.goodFlipsCounter =0;
		this.g = Myg;
	}
	
	public void play() throws InterruptedException
	{
		while(this.g.getNumOfRounds() < 10)
		{
			if(g.flipCoin() == 1)
			{
				this.goodFlipsCounter++;
			}
			Thread.sleep(1000);
		}
	}
	
	public int getScore()
	{
		return this.goodFlipsCounter;
	}
}
