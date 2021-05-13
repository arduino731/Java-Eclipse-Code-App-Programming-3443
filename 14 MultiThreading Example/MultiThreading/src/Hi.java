
public class Hi extends Thread{
	Counter c;
	
	public Hi(Counter c) {
		this.c = c;
	}

	public void run(){
		 for(int i=1;i<1000;i++){
			 //System.out.println("Hi");
			 c.increment();
	  }
}
}
	
