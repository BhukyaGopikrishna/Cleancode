package epam_task_4;

public class Find_Interest {
	public float simple_interest(float princpal_amount,int years,float rate_of_interest)
	{
		return (princpal_amount*years*rate_of_interest)/100;
	}
	public float compound_interest(float principal_amount,int no_of_times,int years,float rate_of_interest)
	{
		return principal_amount*exp((1+(rate_of_interest/no_of_times)),years);
	}
	public float exp(float n,int f)
	{
		float a=1;
		for(int i=0;i<f;i++)
			a=a*n;
		return a;
	}

}
