package DrinkStore;

public class Drink extends Item{
	public int drinkAmount=0;
	public Drink(int num,String name) {
		//this.price=price;
		//this.name=name;
		super(num, name);
		
	}

	@Override
	public int getnum() {
		// TODO Auto-generated method stub
		return num;
	}

	/*
	@Override 
	public void setnum(int num) {
		// TODO Auto-generated method stub
		this.num=num;
	}*/

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	/*
	@Override
	public void setName(String name) {
		this.name=name;
		
	}*/
	
	
	
	
	
	
}
