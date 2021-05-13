
public class Consumer implements Runnable{
    Q q;
    
	public Consumer(Q q) {
		this.q = q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		while(true){
			q.get();
			try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}
		
	}

