
public class StrategyDemo {
	public static void main(String[] args)
	{
		Robot robot =new Robot();
		robot.SetBehoviour(new DefensiveBehviour());
		robot.Mode();
	}

}
