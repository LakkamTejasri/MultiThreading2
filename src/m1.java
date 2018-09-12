
class MyRun implements Runnable{

	public void run()
	{
		System.out.println("normal");
	}
	public void A()
	{
		System.out.println("a");
	}
}
class main
{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRun r=new MyRun();
		Thread t= new Thread(r);
		t.start();
		t.isAlive();
		//System.out.println(t.getId());
		t.setPriority(7);
		//String name=t.getName();
		
	}

}
