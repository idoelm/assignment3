package assig3_1;

public class Threadjudge extends Thread
{
	private Judge myJudge;
	
	public Threadjudge(Judge myJudge)
	{
		this.myJudge = myJudge;
	}
	
	public void run()
	{
		myJudge.theJudge();
	}
}
