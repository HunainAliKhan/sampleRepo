
public class Robot 
{
	RobotBehaviour rb;
	
		public void Name()
		{
			System.out.println("My name is binny the robot");
		}
		public void SetBehoviour(RobotBehaviour robot)
		{
			this.rb = robot;
		}
		public void Mode()
		{
			rb.behaviour();
		}
		
}

