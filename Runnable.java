class Some
{
public static void main(String... ar)
{

Runnable r = new Runnable(){	 
	public void run()	 
	{
	Thread t= Thread.currentThread();
	t.setName("Anonymous Thread");	
	System.out.println("Name of the other thread - " + t.getName());
	for(int i=0;i<3;i++)
	{
		System.out.println(t.getName() + " " + i);
	}

	}
	};

Thread t= new Thread(r);  
t.start();		  
System.out.println("Name of main thread - "+ Thread.currentThread().getName()); 
}
}
