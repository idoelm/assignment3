//Ido Elmakies 316476340
package assig3_1;

public class Judge extends Thread {
	  private GamePlay gamePlay;
	  
	  public Judge(GamePlay gamePlay) {
	    this.gamePlay = gamePlay;
	  }
	  
	  public void run() {
	    while (!isInterrupted()) {
	      gamePlay.makeCoinAvail(false);
	      try {
	        Thread.sleep(1000);
	        gamePlay.makeCoinAvail(true);
	        Thread.sleep(500);
	      } catch (InterruptedException e) {
	        interrupt();
	      }
	    }
	  }
	}
