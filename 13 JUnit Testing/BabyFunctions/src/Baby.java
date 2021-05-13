
public class Baby {

	private String name;
	private boolean happy=false;
	
	public Baby(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isHappy(){
		return happy;
	}
	
	public void playWithToy(){
		happy=true;
	}
	
	public void printHappMessage(){
		//if(!happy){
		//	throw new IllegalStateException();
		//}
		System.out.println("I am happy");
	}
	
	public void waitTillHappy(){
		while(!happy){
			//do nothing
		}
	}
	
}
