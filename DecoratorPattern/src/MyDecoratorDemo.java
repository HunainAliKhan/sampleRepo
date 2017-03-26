
public class MyDecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Shape shape = new RedShape(new Circle());
			shape.draw();
	}

}
interface Shape
{
	void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("this is a rectangle");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println(" Circle");
	}
}



class shapeDecorator implements Shape
{
	Shape shape;
	public shapeDecorator(Shape shape)
	{
		this.shape = shape;
	}
	public void draw()
	{
		shape.draw();
	}
}

class RedShape extends shapeDecorator
{

	public RedShape(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	public void draw()
	{
		shape.draw();
		setRedBoundary(shape);
	}
	public void setRedBoundary(Shape shape)
	{
		System.out.println("this is red");
	}
	
}