import java.applet.Applet;
import java.awt.Graphics;

public class Thread extends Applet implements Runnable
{
	private String display;
private int x,y,flag;
Thread t;
public void init()
{
	display = "Greek";
	x=100;
	y=100;
	/*   flag=1;
	t=new Thread(this. "Mythread");
	t.start();     */
}
public void update()
{
	x=x+10*flag;
	if(x>300)
		flag= -1;
	if(x<100)
		flag= 1;
}
	public void run()
	{
		while (true)
		{
			repaint();
			update();
			try {
				Thread.sleep(1000);
			}    
			catch (InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g)
	{
		g.drawString(display, x, y);
	}

}
