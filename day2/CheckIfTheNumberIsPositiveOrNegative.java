package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {
	
	public int PlusOrMinus(int A)
	{
	if(A>0)
	{
		System.out.println(A+" "+"Positive value");
		return(A);
	
	}
	else if(A<0)
		{
		System.out.println(A+" "+"Negative value");
		return(A);
		}
		else
		{
		System.out.println(A+" "+"is neither positive nor negative");
		return(A);
		}
	}
	

	public static void main(String[] args) {
		CheckIfTheNumberIsPositiveOrNegative Check = new CheckIfTheNumberIsPositiveOrNegative();
		Check.PlusOrMinus(0);
	}

}
