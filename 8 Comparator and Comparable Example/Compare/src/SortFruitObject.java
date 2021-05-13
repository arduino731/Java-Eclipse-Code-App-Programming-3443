import java.util.Arrays;

public class SortFruitObject{
	
	public static void main(String args[]){

		//Fruit[] fruits = new Fruit[4];
		
		//Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		//Fruit apple = new Fruit("Apple", "Apple description",100); 
		//Fruit orange = new Fruit("Orange", "Orange description",80); 
		//Fruit banana = new Fruit("Banana", "Banana description",90);
		
        FruitComparator[] fruits = new FruitComparator[4];
		
		FruitComparator pineappale = new FruitComparator("Pineapple", "Pineapple description",70); 
		FruitComparator apple = new FruitComparator("Apple", "Apple description",100); 
		FruitComparator orange = new FruitComparator("Orange", "Orange description",80); 
		FruitComparator banana = new FruitComparator("Banana", "Banana description",90); 
		
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		//Arrays.sort(fruits);
		Arrays.sort(fruits, FruitComparator.FruitNameComparator);
		int i=0;
		//for(Fruit temp: fruits){
		  // System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			//", Quantity : " + temp.getQuantity());
		//}
		
		for(FruitComparator temp: fruits){
			   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
				", Quantity : " + temp.getQuantity());
			}
	}	
}
