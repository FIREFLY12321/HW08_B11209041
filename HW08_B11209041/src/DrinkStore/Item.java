package DrinkStore;

public abstract class Item {
	protected int num;
	protected String name;
	
	
	public Item(int num,String name) {
		this.num=num;
		this.name=name;
		
	}
	//public static Item uniqueSolution;
	
	public abstract int getnum() ;
		
	
	//public abstract  void setnum(int price) ;
	public abstract String getName() ;

	//public abstract void setName(String name) ;

	



	
}
