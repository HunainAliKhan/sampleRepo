
public class Client {
	public static void main( String arg[] ) throws CloneNotSupportedException 
	{
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		Rectangle value3 = (Rectangle)rectangle2.clone();
		System.out.println(rectangle.MyValue);
		
		rectangle2 = rectangle;
		
		rectangle2.MyValue = "hello";
		System.out.println(rectangle.MyValue);
		System.out.println(value3.MyValue);
		
		
		
	}
	

}
