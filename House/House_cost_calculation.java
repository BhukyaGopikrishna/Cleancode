package House;
import java.util.Scanner;
public class House_cost_calculation extends Cost_Calc {
	public void cost()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area of site in square feet");
		float area=sc.nextFloat();
		System.out.println("Enter the choice if you need fully automated home\n1.YES\n2.NO");
		int ch=sc.nextInt();
		if (ch==2)
		{
			System.out.println("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
			int ch_1=sc.nextInt();
			if (ch_1<1 && ch_1>3)
			{
				System.out.println("Enter valid choice");
			}
			else
			{
				System.out.println("cost of house construction : "+find_cost(ch_1,area));
			}
		}
		else if(ch==1)
		{
			System.out.println("Cost of house construction : "+find_cost(4,area));
		}
		else
		{
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
	public static void main(String args[])
	{
		House_cost_calculation obj=new House_cost_calculation();
		obj.cost();
	}
}
