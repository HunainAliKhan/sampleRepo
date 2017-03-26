
public class CORdemo 
{
	public static void main(String[] args)
	{
		Number num = new Number();
		num.number1=2;
		num.number2 = 1;
		num.choose = "Subtraction";
		Chain abc = new Addition();
		Chain def = new Subtraction();
		abc.Handler(def);
		def.Handler(abc);
		abc.Calculate(num);
	}	

}

interface Chain
{
	public void Handler(Chain chain);
	public void Calculate(Number number);
}

class Number
{
	
int number1;
int number2;
String choose;

public int getNumber()
{
	return number1;
}
	public int getNumber2()
	{
	return number2;
}

}


class Addition implements Chain
{
	Chain chain;
	

	@Override
	public void Handler(Chain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void Calculate(Number number) 
	{
		// TODO Auto-generated method stub
		if (number.choose == "Addition")
		{
			System.out.println("Addition : " + (number.number1 + number.number2) );
		}
		else
		{
			chain.Handler(chain);
		}
		
	}
	
}
class Subtraction implements Chain
{
	Chain chain;
	

	@Override
	public void Handler(Chain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void Calculate(Number number) 
	{
		// TODO Auto-generated method stub
		if (number.choose == "Subtraction")
		{
			System.out.println("Subtraction : " + (number.number1 - number.number2) );
		}
		else
		{
			chain.Calculate(number);
		}
		
	}
	
}