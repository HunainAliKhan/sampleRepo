
public class AFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FactoryProducer fp = new FactoryProducer();
			AFactory abstractFactory = fp.createFactory("color");
			Color abc = abstractFactory.getColor("Green");
			abc.fill();
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
interface Color
{
	void fill();
}
class Red implements Color
{
	public void fill()
	{
		System.out.println("im Red");
	}
}

class Green implements Color
{
	public void fill()
	{
		System.out.println("im Green");
	}
}

abstract class AFactory
{
	abstract Color getColor(String color);
	abstract Shape getShape(String name);
}


class shapeFactory extends AFactory
{
	public Shape getShape(String name)
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

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
class ColorFactory extends AFactory
{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color.equals("Red"))
		{
			return new Red();
		}
		else if(color.equals("Green"))
		{
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
class FactoryProducer
{
	public AFactory  createFactory(String factName)
	{
		if(factName.equals("color"))
		{
			return new ColorFactory();
		}
		else if(factName.equals("shape"))
		{
			return new shapeFactory();
		}
		return null;
	}
}


