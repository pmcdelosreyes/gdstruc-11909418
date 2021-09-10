package net.codejava;
import java.util.Scanner;

public class module1 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner kbd = new Scanner(System.in);
		String answer;
		
		System.out.println("Enter number of elements:");
		int num = input.nextInt();
		 
		int numbers[] = new int[num];
		 
		System.out.println("Enter " + num + "numbers:\n");
		for (int i = 0; i < num; i++) 
		{
			numbers[i] = input.nextInt();
		}
		
		System.out.println("Enter Y to use Bubble Sort, Enter N to use Selection Sort:");
		answer = kbd.nextLine();
		
		switch(answer)
		{
		case "Y":
			System.out.println("\nBefore Bubble sort descending:");
			printArrayElements(numbers);
			
			bubbleSortDescending(numbers);
			
			System.out.println("\n\nAfter Bubble sort descending:");
			printArrayElements(numbers);
			
			break;
			
		case "N":
			System.out.println("\nBefore Selection sort descending:");
			printArrayElements(numbers);
			
			selectionSortDescending(numbers);
			
			System.out.println("\n\nAfter Selection sort descending:");
			printArrayElements(numbers);
			break;
		}
	}
	
	private static void bubbleSortDescending(int[] numbers)
	{
		 for(int j = 0; j < numbers.length; j++)
		 {
			 for(int i = 1; i < (numbers.length - j); i++)
			{
				 if(numbers[i - 1] < numbers[i])
				{
					 int temp = numbers[i - 1];
					 numbers[i - 1] = numbers[i];
					 numbers[i] = temp;
				}
			}
		}
	}
	
	private static void selectionSortDescending(int[] numbers)
	{
	     for (int i = numbers.length - 1; i > 0; i--) 
	     {
	          int smallestIndex = 0;   
	          for (int j = 1; j <= i; j ++)  
	          {
	               if (numbers[j] < numbers[smallestIndex])   
	               {
	                 smallestIndex = j;
	               }
	          }
	          int temp = numbers[smallestIndex];
	          numbers[smallestIndex] = numbers[i];
	          numbers[i] = temp; 
	      }           
	}
	
	private static void printArrayElements(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
	}
}
