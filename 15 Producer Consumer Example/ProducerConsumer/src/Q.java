
public class Q {
   int num;
   boolean valueSet=false;

public void get() {
	//while(!valueSet){
		//try {wait();} catch (Exception e) {}
	//}
	System.out.println("Get "+num);
	
	valueSet=false;
	//notify();
}

public void put(int num) {
	//while(valueSet){
		//{
			//try{wait();} catch(Exception e){}
		//}
	System.out.println("Set "+num);
	this.num=num;
	valueSet=true;
	//notify();
}
   
}

