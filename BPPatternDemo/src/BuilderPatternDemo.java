import java.util.ArrayList;
import java.util.List;

public class BuilderPatternDemo {
	public static void main(String[] args)
	{
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.prepareVegMeal();
		meal.showItems();
	}

}



interface item
{
	String name();
	Packing packing();
	float price();
}

interface Packing
{
	public String pack();
}

class Wrapper implements Packing
{

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Wrapper";
	}
	
}
class Bottle implements Packing
{

	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Bottle";
	}
	
}

abstract class Burger implements item
{

	public Packing packing()
	{
		return new Wrapper();
	}
	public abstract float price(); 
}



class VegBurger extends Burger
{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 2.00f;
	}
	
}

class ChikenBurger extends Burger
{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 4.00f;
	}
	
}



abstract class ColdDrink implements item
{

	

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();
	
}


class pepsi extends ColdDrink
{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "pepsi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 1.00f;
	}
	
}

class Meal
{
	 private List<item> items = new ArrayList<item>();	
	 
	 public void AddItem(item addItem)
	 {
		items.add(addItem);
	 }
	 
	 public float getCost(){
	      float cost = 0.0f;
	      
	      for (item item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }
	 public void showItems(){
		   
	      for (item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
	      }		
	   }	
	}


class MealBuilder
{
	public Meal prepareVegMeal()
	{
		Meal meal = new Meal();
		meal.AddItem(new VegBurger());
		meal.AddItem(new pepsi());
		return meal;
		
	}
}

