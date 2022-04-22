package threadapp1;

import java.applet.Applet;

public class Thread extends Applet


{
	float h,w;
	boolean thread ;
	Thread t = null;

	 
	public void init()
	{
		System.out.println("init(): start");
		w = getMaximumSize().width;
		h = getMaximumSize().height;
		
		Object color;
		setBackground(color.gray);
		System.out.println("init(): stop");
	}
	public void destroy()
	{
		System.out.println("destroy()");
	}
	public void start()
	{
		System.out.println("start(): start");
		if(t==null)
		{
			System.out.println("start(): created thread");
			t=new Thread();
			System.out.println("start(): starting thread");
           
          
		}
		else
			if(thread)
			{
				thread=true;
				System.out.println("start(): notifies thread");
				synchronized(this)
				{
					show();
				}
			}
	
	System.out.println("start(): stop");

}}

