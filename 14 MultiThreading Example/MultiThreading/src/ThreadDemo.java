

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
	 Counter c=new Counter();
     Hi obj1=new Hi(c);
     Hello obj2=new Hello(c);
     //Thread t1=new Thread(obj1);
     //Thread t2=new Thread(obj2);
     obj1.start();
     System.out.println(obj1.isAlive());
     obj2.start();
     obj1.join();
     obj1.setPriority(Thread.MAX_PRIORITY);
     System.out.println(obj1.getPriority());
     System.out.println(obj2.getName());
     obj2.join();
     System.out.println(c.count);


	}

}
