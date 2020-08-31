import java.util.Scanner; // Scanner class is used to take input from the user

class armstrong // making a new class with name same as your file name
{
	public static void main(String[] args) //main method is starting point of execution of our program
	{
		
		Scanner obj = new Scanner(System.in);//create the scanner object

		System.out.println("Enter the Number you want to check for armstrong");
		int n = obj.nextInt(); //takes the input from the user

		int result=0; 
		int rem=0;
		int temp=n;

		
		//153 

		while(temp!=0) //temp=1
		{
			rem=temp%10; // rem=1
			result=result+cube(rem); //result = 152 + 1 = 153
			temp=temp/10; //temp =1/10 =0

		}

		if(result==n)
		{
			System.out.println("The number you have entered is an armstrong number");
		}
		else
			System.out.println("The number you entered is not an armstrong number ");
	}

	 static int cube(int n) //return the cube of any number
	 {
	 	return n*n*n;
	 }
}