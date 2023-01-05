package assig3_1;

public class MyThread extends Thread 
{
	private Gamer MyGamer;
	private Judge myJudge;
	
	public MyThread(Gamer MyGamer, GamePlay game)
	{
		this.MyGamer = MyGamer;
		this.myJudge = new Judge(game);
	}
	
	public void run()
	{
		try {
			//myJudge.theJudge();
			MyGamer.play();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
