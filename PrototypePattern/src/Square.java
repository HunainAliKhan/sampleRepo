
public class Square extends Shapes {
	String MyValue = "im a Square";
	public void draw()
	{
		System.out.println("im a Square");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
