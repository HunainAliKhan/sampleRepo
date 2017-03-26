
public class Rectangle extends Shapes {
	String MyValue = "im a rectangle";
	public void draw()
	{
		System.out.println("im a Rectangle");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return  super.clone();
	}
}
