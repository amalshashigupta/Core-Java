package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr1 = {50,54,12,23,43,90};
		
		System.out.println("Total num of values inside array are " + arr1.length);
		
		System.out.println("Value at location 2 is " + arr1[1]);
		
		System.out.println("Value at last location is " + arr1[arr1.length-1]);

		
		
		
		System.out.println("\n"+"*****************************************");

		// find the sum of all the digits in num2
		// find out the rev num of num1
		// do not convert this num into string

		int numA = 1028552023;
		int numB=0;	
		int sum=0;
		System.out.println("The given number = " +numA);
		System.out.print("reverse of the given number = ");
		while(numA!=1)
		{
		numB=numA%10;
		System.out.print(numB);
		
		if((numA-numB!=0))
		{numA=(numA-numB)/10;}
		
		sum=sum+numB;
		}System.out.print(numA + "\n");
//		System.out.println();
		System.out.println("sum of all digits = " +sum);
		System.out.println("*****************************************");


	}

}
