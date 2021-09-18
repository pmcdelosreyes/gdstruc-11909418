package net.codejava;
import java.util.Scanner;

public class Module2Quiz {

	public static void main(String[] args)
	{
		
		PlayerLinkedList playerLinkedList = new PlayerLinkedList();
		
		Player asuna = new Player(1, "Asuna", 100); 
		Player lethalBacon = new Player(2, "LethalBacon", 205); 
		Player hpDeskjet = new Player(3, "HPDeskjet", 34);
		
		Scanner input = new Scanner(System.in);
		Scanner kbd = new Scanner(System.in);
		String answer;
		int idAnswer;
		int lvlAnswer;
		
		playerLinkedList.addToFront(asuna); 
		playerLinkedList.addToFront(lethalBacon);
		playerLinkedList.addToFront(hpDeskjet);
		
		playerLinkedList.printList();
		
		System.out.println("Enter Y to delete HEAD, Enter N to SKIP deletion:");
		answer = kbd.nextLine();
		
		switch(answer)
		{
		case "Y":
			playerLinkedList.deleteFirst();
			System.out.println("\n\nAfter deleting the first element:");
			playerLinkedList.printList();
			playerLinkedList.countElements();
			break;
			
		case "N":
			System.out.println("\nYour List:");
			playerLinkedList.printList();
			playerLinkedList.countElements();
			break;
		}
		
		System.out.println("\nDo you wish to find the index or level of a player in the list?");
		System.out.println("Press Y to find the INDEX, press N to find the LEVEL:");
		answer = kbd.nextLine();
		
		switch(answer)
		{
		case "Y":
			System.out.println("Input ID of the player you are searching for:");
			idAnswer = kbd.nextInt();
			playerLinkedList.indexOf(idAnswer);
			break;
		case "N":
			System.out.println("\n\nInput level of the player you are searching for:");
			lvlAnswer = kbd.nextInt();
			playerLinkedList.contains(lvlAnswer);
			break;
		}
		System.out.println("\nThank you and have a nice day!");
	}
}