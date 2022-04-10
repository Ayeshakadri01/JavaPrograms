package MyjavaPrograms;

import java.util.Scanner;

public class FactorialNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num =sc.nextInt();
		int fact=1,i;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of the number is "+fact);		

	}

}
