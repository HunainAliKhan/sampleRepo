import java.util.*;
public class Singleton {
	public static void main(String[] args) 
	{
		
	President[] osama = new President[7];
	
	osama[0] = President.getObject("bbbb",13);
	osama[1] = President.getObject("aaa",13);
	osama[2] = President.getObject("cc",13);
	osama[3] = President.getObject("dddd",13);
	osama[4] = President.getObject("dddd",13);
	osama[5] = President.getObject("dddd",13);
	osama[6] = President.getObject("dddd",13);

	//osama[2] = President.getObject("cccc",13);
	//osama[3] = President.getObject("dddd",13);
	
	
	for(President p : osama)
	{
		System.out.println(p.name + '\n' + p.age);
	}
	System.out.println(President.index);
	
	
	

	
	
	}

}
class President
{
	public  String name;
	public  Integer age;
	static Integer count=-1;
	static int index=-1;
static	President[] president = new President[3];
	private President(String name,Integer age)
	{
		this.name = name;
		this.age = age;
	}
	public static President getObject(String name,Integer age)
	{
		int modulas=0;
		if(count < 2)
		{
			count++;
			President p = new President(name,age);
			president[count] = p;
			
		}
		else
		{
			
			if(index == 2)
			{
				
				index = -1;
				
				
			}
			index++;
			return president[index];
		}
		
		return president[count];
	}

	public President pres()
	{
		 return president[count];
	}
	
	
}
