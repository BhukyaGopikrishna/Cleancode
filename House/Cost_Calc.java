package House;

public class Cost_Calc {
	float find_cost(int ch,float area)
	{
		if (ch==4)
			return 2500*area;
		else
			return 300*(ch+3)*area;
	}
}
