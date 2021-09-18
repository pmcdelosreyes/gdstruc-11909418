package net.codejava;

public class PlayerLinkedList {

	private PlayerNode head;
	private void remove(PlayerNode head)
	{
	}
	
	public void addToFront(Player player)
	{
		PlayerNode playerNode = new PlayerNode(player);
		playerNode.setNextPlayer(head);
		head = playerNode;
	}
	
	public void printList()
	{
		PlayerNode current = head;
		System.out.print("HEAD -> ");
		while (current != null)
		{
			System.out.print(current.getPlayer().getName() + ", Level: " + 
			current.getPlayer().getLevel() + ", ID: " + current.getPlayer().getId());
			System.out.print(" -> ");
			current = current.getNextPlayer();
		}
		System.out.println("null");
	}
	
	public void deleteFirst()
	{
		PlayerNode current = head;
		remove(head);
		head = current.getNextPlayer();
	}
	
	public void countElements()
	{
		PlayerNode current = head;
		int counter = 0;
		while (current != null)
		{
			current = current.getNextPlayer();
			counter++;
		}
		System.out.println("Number of elements remaining: " + counter);
	}
	
	public void indexOf(int id)
	{
		int index = 0;
		PlayerNode current = head;
		while (current != null) 
		{
			if (current.getPlayer().getId() == id)
			{
				System.out.println("The index of ID number " + id + " is: " + index);
				break;
			}
			current = current.getNextPlayer();
			index++;	
		}
		if (current == null)
		{
			System.out.println("This ID cannot be found.");
		}
	}

	public void contains(int lvlAnswer) {
		PlayerNode current = head;
		while (current != null) 
		{
			if (current.getPlayer().getLevel() == lvlAnswer)
			{
				System.out.println("There is a level " + lvlAnswer + " on the list.");
				break;
			}
			current = current.getNextPlayer();
		}
		if (current == null)
		{
			System.out.println("There is no level " + lvlAnswer + " on the list.");
		}
	}
}
