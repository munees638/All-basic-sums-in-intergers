package org.integers;

import java.util.Scanner;

public class OneAll {

	public static void main(String[] args)
	{
	
	// 1.Find odd or Even :
	
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	if(num % 2 == 0)
		System.out.println(num +" is even Number.");
	else
		System.out.println(num +" is odd Number.");
	
/////////////////////////////////////////////////////////////////////////
//2.Prime or Not :
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	boolean isPrime = true;
//	for(int i= 2 ; i <= num / 2; i++)
//	{
//		if(num % i == 0)
//		{
//			isPrime = false;
//			break;	
//		}
//	}
//	
//	if(isPrime)
//		System.out.println(num +" is Prime Number.");
//	else 
//		System.out.println(num +" is not Prime Number.");
	
/////////////////////////////////////////////////////////////////////////

//3.Leap year or Not :
	
//	System.out.println("ENTER YEAR: ");
//	Scanner input = new Scanner(System.in);
//	int year = input.nextInt();
//	if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//		System.out.println(year + " is Leap year.");
//	else
//		System.out.println(year + " is not Leap year.");
	
	
/////////////////////////////////////////////////////////////////////////

//4.Reverse the Given Number:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int rev = 0;
//	while(num!=0)
//	{
//		int temp = num % 10;
//		rev = rev *10 + temp;
//		num = num / 10;
//	}
//	System.out.println("Revered Number is: "+rev);
	
/////////////////////////////////////////////////////////////////////////

//5.Count the length of given Number:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int count = 0;
//	while(num != 0)
//	{
//		count++;
//		num = num / 10;
//	}
//	System.out.println("Length of Given Number is "+ count + ".");
	
/////////////////////////////////////////////////////////////////////////
	
//6. Check the Given Number is Palindrome or not:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int temp = num;
//	int rev = 0;
//	while(temp !=0)
//	{
//		rev = rev * 10 + temp % 10;
//		temp = temp / 10;
//	}
//	//System.out.println(rev);
//	if(num == rev)
//		System.out.println("Given Number is Palindrome");
//	else
//		System.out.println("Given Number is not Palindrome");
	
/////////////////////////////////////////////////////////////////////////		
	
//7. Pattern Program with one loop:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	while(num!=0)
//	{
//		System.out.println(num);
//		num = num / 10;
//	}
	
/////////////////////////////////////////////////////////////////////////	
	
//8. Sum of Digits :
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int sum = 0;
//	// By Formula n(n+1)/2 :
//	//int lastNo = num % 10;
//	//int sum1 = (lastNo*(lastNo+1)/2);
//	//System.out.println(sum1);
//	while(num!=0)
//	{
//		int temp = num % 10;
//		sum = sum + temp;
//		num = num / 10;
//	}
//	System.out.println("SUM OF DIGITS: "+sum);
	
//////////////////////////////////////////////////////////////////////////
	
//9. sum of digits untill it become single digit.
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	while(true)
//	{
//	int sum = 0;
//	while(num>0)
//	{
//		int temp = num % 10;
//		sum = sum + temp;
//		num = num / 10;
//	}
//	if(sum <10)
//	{
//		System.out.println("SUM OF DIGITS: "+ sum);
//		break;
//	}
//	else
//		num = sum;
//	}	
	
/////////////////////////////////////////////////////////////////////////
	
//10. Adam Number :
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int square = num * num;
//	//System.out.println(square);
//	int temp = 0;
//	int rev = 0;
//	while(square!= 0)
//	{
//		temp = temp * 10 + square % 10;
//		square = square / 10;
//	}
//	//System.out.println(temp);
//	int num1 = (int) Math.sqrt(temp);
//	//System.out.println(num1);
//	while(num1!=0)
//	{
//		rev = rev * 10 + num1 % 10;
//		num1 = num1 / 10;
//	}
//	//System.out.println(rev);
//	if(num == rev)
//		System.out.println(num + " is Adam Number.");
//	else
//		System.out.println(num + " is not Adam Number.");
	
/////////////////////////////////////////////////////////////////////////
	
//11. Addition of First n Numbers :
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int sum = 0;
//	for(int i = 0; i<=num;i++)
//	{
//		sum = sum + i;
//	}
//	System.out.println("Sum of upto " + num + " is " + sum + ".");
	
/////////////////////////////////////////////////////////////////////////
	
//12. Find First 20 Prime Numbers:

//	int sNo = 0;
//	int count = 0;
//	System.out.println("First Twenty Prime Numbers:");
//	for(int num = 2; num<100;num++)
//	{
//	boolean isPrime = true;
//	for(int i= 2 ; i <= num / 2; i++)
//		{
//			if(num % i == 0)
//			{
//				isPrime = false;
//				break;	
//			}
//		}
//		if(isPrime == true)
//		{
//			count ++;
//			if(count>20)
//				break;
//			else {
//				sNo ++;
//				//System.out.println(sNo + ".) " + num);
//				System.out.print(num + ", ");
//			}
//		}
//	}
//		
	
/////////////////////////////////////////////////////////////////////////
	
//13. Find Factorial of given number by Loop:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int fact = 1;
//	for(int i=1;i<=num;i++)
//	{
//		fact = fact * i;
//	}
//	System.out.println(num + "! = " + fact + ".");
	
/////////////////////////////////////////////////////////////////////////

//14. Find Factorial of given number by Recursion:
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int factNo = fact(num);
//	System.out.println(num + "! = " + factNo + ".");		
//} // main method ends
//	
//// new method for find factorial
//private static int fact(int num) {
//	
//	if(num == 1)
//		return 1;
//	return num * fact(num - 1);
	
/////////////////////////////////////////////////////////////////////////

//15. Find Addition of First Five Odd Numbers :
	int sum = 0;
	for(int i = 1; i<10; i++)
	{
		if(i % 2 == 1)
		sum = sum + i;
	}
	System.out.println("Sum of First Five Odd Numbers is " + sum);
	
/////////////////////////////////////////////////////////////////////////

//16. Find All Divisors of Given Number :
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	System.out.println("All Divisors of " + num + " is ");
//	for(int i = 1; i<=num ; i++)
//	{
//		if(num % i == 0)
//		{
//			System.out.println(i);
//		}
//	}
	
/////////////////////////////////////////////////////////////////////////	

//17. Find Given number is Armstrong Number:
	
//Sum of the cube of its digits is equal to the Number. 153, 370, 371, 407 = (4)^3 + (0)^3 + (7)^3	
	
//	Scanner input = new Scanner(System.in);
//	int num = input.nextInt();
//	int sum = 0;
//	int temp = num;
//	while(temp!=0)
//	{
//		int rem = temp % 10;
//		//sum = sum + rem * rem * rem;
//		sum += Math.pow(rem, 3);
//		temp = temp / 10;
//	}
//	//System.out.println(sum);
//	if(num == sum)
//		System.out.println(num+ " is Armstrong Number.");
//	else
//		System.out.println(num + " is  not Armstrong Number.");
	
/////////////////////////////////////////////////////////////////////////
	
//18. Find Armstrong Number Between 100 to 1000 :
	
//	System.out.println("Armstrong Number Between 100 to 1000:");
//	for(int num = 100; num<=1000; num++)
//	{
//	int sum = 0;
//	int temp = num;
//	while(temp!=0)
//	{
//		int rem = temp % 10;
//		//sum = sum + rem * rem * rem;
//		sum += Math.pow(rem, 3);
//		temp = temp / 10;
//	}
//	//System.out.println(sum);
//	if(num == sum)
//		System.out.println(num);
//	}
	
/////////////////////////////////////////////////////////////////////////

//19. Find HCF or GCD for Given two numbers :
	
//Scanner input = new Scanner(System.in);
//int num1 = input.nextInt();
//int num2 = input.nextInt();
//int gcd = 1;
//int temp = num1;
//if(num2>num1)
//	temp = num2;
//for(int i = 1; i<=temp; i++)
//{
//	if((num1% i == 0) && (num2 % i == 0))
//		gcd = i;
//}
//System.out.println("HCF of " + num1 + " and " + num2 + " is " + gcd);
	
/////////////////////////////////////////////////////////////////////////	

// 20. Find HCF or GCD for Given three numbers :

//	Scanner input = new Scanner(System.in);
//	int num1 = input.nextInt();
//	int num2 = input.nextInt();
//	int num3 = input.nextInt();
//	int gcd = 1;
//	int temp = num1;
//	if(num2 > num1 && num2 > num3)
//		temp = num2;
//	else
//		temp = num3;
//	
//	for(int i = 1; i<=temp; i++)
//	{
//		if((num1% i == 0) && (num2 % i == 0) && (num3 % i == 0))
//			gcd = i;
//	}
//	System.out.println("HCF of " + num1 + " and " + num2 + " is " + gcd);

/////////////////////////////////////////////////////////////////////////

//20.Find GCD or HCF of Given Numbers two By Recursion using Euclidean Algorithm:
	
//	Scanner input = new Scanner(System.in);
//	int num1 = input.nextInt();
//	int num2 = input.nextInt();
//	
//	int gcd = findGcd(num1, num2);		
//	System.out.println("HCF of " + num1 + " and " + num2 + " is " + gcd);
//}
//
//private static int findGcd(int num1, int num2) {
//	
//	if(num1 == 0)
//		
//		return num2;
//	
//	return findGcd(num2 % num1, num1);

/////////////////////////////////////////////////////////////////////////
//21 Find LCM of the Given two Numbers :
	
//	Scanner input = new Scanner(System.in);
//	int num1 = input.nextInt();
//	int num2 = input.nextInt();
//	int max, step, lcm = 0;
//	if(num1 > num2)
//		max = step = num1;
//	else
//		max = step = num2;
//	
//	while(num1 !=0)
//	{
//		if(max % num1 == 0 && max % num2 == 0)
//		{
//			lcm = max;
//			break;
//		}
//		max += step;
//	}
//	System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

	
/////////////////////////////////////////////////////////////////////////

}
}
