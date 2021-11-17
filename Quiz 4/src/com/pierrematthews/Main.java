package com.pierrematthews;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 640);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        hashtable.printHashtable();

        System.out.println("\nRetrieving Name: Wardell");
        System.out.println(hashtable.get("TSM Wardell"));
        System.out.println("\nRemoving Name: Subroza");
        System.out.println(hashtable.remove("Subroza"));

        System.out.println("\nPrinting again:");
        hashtable.printHashtable();
    }
}
