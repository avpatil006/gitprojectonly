
public class SimpleInterest {
	void getsi(double p, float r, int t)
	{
		double SI=(p*r*t)/100;
		System.out.println("Interest is=="+SI);
		double ta=p+SI;
		System.out.println("Total Amount is=="+ta);
	}
	
	public static void main(String args[]) {
		SimpleInterest si=new SimpleInterest();
		if (args.length>=3)
		{
			String s1=args[0].trim();
	/*		double d1=new double();
			double p=d1.doubleValue();
			float r=float.parse
		*/			
		}
		

	}

}
