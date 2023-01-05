//Ido Elmakies 316476340
package assig3_1;

public class main {

	public static void main(String[] args) 
	{
		GamePlay game = new GamePlay();
		Gamer Gamer1 = new Gamer(game);
		Gamer Gamer2 = new Gamer(game);
		Judge judge = new Judge(game);

		
		MyThread t1 = new MyThread(Gamer1,game);
		MyThread t2 = new MyThread(Gamer2,game);
		
		judge.start();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
			judge.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Gamer1.getScore()>Gamer2.getScore())
		{
			System.out.println("Gamer1 win");
		}
		else if(Gamer1.getScore() < Gamer2.getScore())
		{
			System.out.println("Gamer2 win");
		}
		else
		{
			System.out.println("tie");
		}
		

	}

}
