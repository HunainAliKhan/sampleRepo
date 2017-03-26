
public class PrototypePatternsDemo 
{
	public static void main(String [] agrs)
	{
	CloneFactory cF = new CloneFactory();
	Animal a = new Bird();
	Bird ab =(Bird) cF.makeClone(a);
	
	}	
}


interface Animal extends Cloneable
{
Animal makeCopy();
}


class Sheep implements Animal
{
	


	@Override
	public Animal makeCopy() {
		System.out.println("im a Sheep");
		Sheep mySheep= null;
		try {
			mySheep =(Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mySheep;
	}
	
}
class Bird implements Animal
{

	@Override
	public Animal makeCopy() {
		System.out.println("im a bird");
		Bird myBird= null;
		try {
			myBird =(Bird) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myBird;
	}
	
}


class CloneFactory
{
		public Animal makeClone(Animal animal)
		{
			return animal.makeCopy();
		}
	
}