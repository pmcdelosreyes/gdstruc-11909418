package com.pierrematthews;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        System.out.println("Trees in Order: ");
        tree.traverseInOrder();
        System.out.print("\nGet tree value = -5: ");
        System.out.println(tree.get(-5));

        //quiz 6
        System.out.print("\nGet minimum tree: ");
        System.out.println(tree.getMin());

        System.out.print("\nGet maximum tree: ");
        System.out.println(tree.getMax());

        System.out.println("\nTrees in Descending Order: ");
        tree.traverseInOrderDescending();
    }

}
