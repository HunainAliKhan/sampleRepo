
public class nadraProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Chain {

	// Defines the next Object to receive the data
	// if this Object can't process it
	
	public void setNextChain(Chain nextChain);
	public void processing(Candidate request);
	
	// Either solves the problem or passes the data
	// to the next Object in the chain
	
}
interface Form
{
	String name=null;
	String fname=null;
	int age=0;
	String dob=null;
	String email=null;
	
	
	
}

class Candidate
{
	String candidateName;
	public Candidate(String candidateName)
	{
		this.candidateName= candidateName;
	}
	public String getCandidateName()
	{
		return candidateName;
	}
}
class Payment implements Chain
{
	Chain nextChain;
	public void setNextChain(Chain chain)
	{
		nextChain = chain;
	}
	public void processing(Candidate request)
	{
		System.out.println(request.getCandidateName() + "Please Take Your Form");
	nextChain.processing(request);
	}
}


class fillForm implements Form,Chain
{
	Chain nextChain;
	boolean isProcessComplete;
	public fillForm(String name,String fname,String dob,String email)
	{
		name = name;
		fname = fname;
		dob = dob;
		email = email;
	
		
	}
	public void setNextChain(Chain chain)
	{
		nextChain = chain;
	}
	public void processing(Candidate request)
	{
		if(request.getCandidateName() == "hunain")
		{
			System.out.println(request.getCandidateName() + "you have your Form");
			nextChain.setNextChain(nextChain);
	
	}
	
	
}
class Photo implements Chain
{
	Chain nextChain;
	public void setNextChain(Chain chain)
	{
		nextChain = chain;
	}
	public void processing(Candidate request)
	{
		if (request.getCandidateName() == "Hunain")
		{
			System.out.println(request.getCandidateName() + "Your photo has been take");
			nextChain.processing(request);
		}
	}
}

class FingerPrints implements Chain 
 {
	Chain nextChain;
	boolean FingerPrintTaken;
	public void setNextChain(Chain chain)
	{
		nextChain = chain;
	}
	public void setFingerPrint()
	{
		FingerPrintTaken= true;
	}
	public void processing(Candidate request)
	{
	System.out.println("Finger Prints has been take and please collect your form after some days");
	
	}
 }
}


