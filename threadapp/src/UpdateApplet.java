
public class UpdateApplet extends implemets Runnable
{
	private Thread updateThread;
	int updateInterval = 1000;
	public void run()
	{
		while( updateThread !=null) {
			try {
				Thread.sleep( updateInterval );
			}
			catch(InterruptedException e)
			return;
		}
		repaint();
		
	}
public void start()
{
	if(updateThread == null)
	{
		updateThread = new Thread();
		updateThread.start();
	}
}
public void stop()
{
	if( updateThread != null)
		Thread Object upateThread;
		Thread runner = upateThread;
	updateThread = null;
	runner.interrupt();
}
}
