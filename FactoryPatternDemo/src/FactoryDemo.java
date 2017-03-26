import java.util.Scanner;
public class FactoryDemo {

	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			FactoryShape fact = new FactoryShape();
			String name = input.nextLine();
			Shape abc = fact.factoryShape(name.toString());
			abc.draw();
	}

}

class FactoryShape
{
	public Shape factoryShape(String name)
	{
		if(name.equals("Rectangle"))
		{
			return new Ractangle();
		}
		else if(name.equals("Square"))
		{
			return new Square();
		}
		return null;
	}
}


interface Shape
{
	void draw();
}


class Ractangle implements Shape
{

	@Override
	public void draw() {
		System.out.println("im Rectangle");
		
	}
	
}
class Square implements Shape
{

	@Override
	public void draw() {
		System.out.println("im Square");
		
	}
	
}
