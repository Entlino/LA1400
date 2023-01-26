package AeschlimannC;
import robocode.*;

	public class TheDestroyer2 extends JuniorRobot
	{
	int heightdistance;
	int widthdistance;
	int north = 0;
	int east = 90;
	public void run() {
	setColors(yellow, black, yellow, yellow, black);
	gotoTopRightCorner();

		while(true) 
		{
		turnGunLeft(25);
		}
	}
		
	public void onScannedRobot() 
	{
		smartfire();
	}
	public void gotoTopRightCorner() 
	{
		heightdistance = fieldHeight - robotY;
		widthdistance = fieldWidth - robotX;
		turnTo(north);
		ahead(heightdistance);
		turnTo(east);
		ahead(widthdistance);
	}
	public void smartfire() 
	{
		if (scannedDistance < 50)
		{
			fire (3);
		} 
		if (scannedDistance < 100)
		{
			fire (2);
		} 
		else
		{
			fire (1);
		}
	}
	public void onHitByBullet() 
	{
		
	}
	
	public void onHitWall() 
	{
		
	}
	
	
}
