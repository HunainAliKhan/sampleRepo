
abstract class Shapes implements Cloneable
{
	abstract void draw();
	public Object clone() throws CloneNotSupportedException
	{
		return (Shapes) super.clone();
	}
}
