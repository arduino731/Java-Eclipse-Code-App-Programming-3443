
public class Hello extends Thread{
	Counter c;
	
  public Hello(Counter c) {
		this.c = c;
	}

public void run(){
	 for(int i=1;i<1000;i++){
		 //System.out.println("Hello");
		 c.increment();
		 
		}
	 }
  }

