package com.pierrematthews;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {60, 33, 12, 64, 17, 105, -53};
        int numbers2[] = {2, 72, 34, 21, 89, 18, 12};

        System.out.println("First Array: ");
        for (int element: numbers)
        {
            System.out.print(element + ", ");
        }
        System.out.println("\nSecond Array: ");
        for (int element: numbers2)
        {
            System.out.print(element + ", ");
        }
        System.out.print("\nLinear Search at value 105: ");
        System.out.println(linearSearch(numbers, 105));
        System.out.print("Linear Search at value 420: ");
        System.out.println(linearSearch(numbers, 420));
        System.out.print("\nBinary Search at value 33: ");
        System.out.println(binarySearch(numbers, 33));
        System.out.print("Binary Search at value 420: ");
        System.out.println(binarySearch(numbers, 420));

        //inspect and verify ---> inspect and (pierre + verify) HAHAHAHAH witty ba sir? XD kwewe
        System.out.println("\nUsing the Inspect and Pierrify, We are able to find the value of the number at: " );
        System.out.print("First Array: Value = -53: ");
        System.out.println(inspectAndPierrify(numbers, -53));
        System.out.print("Second Array: Value = 12: ");
        System.out.println(inspectAndPierrify(numbers2, 12));
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length -1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle]==value)
            {
                return  middle;
            }
            else if (value < input[middle])
            {
                end = middle -1;
            }
            else  if (value > input[middle])
            {
                start = middle+1;
            }
        }
        return -1;
    }

    public static int inspectAndPierrify(int[] input, int value)
    {
        int head[] = input;
        int temp = 0;

        while (head.length > 2)
        {
            for (int i = 2; i < head.length; i += 2)
            {
                if (i % 2 == 0)
                {
                    if (head[i] == value)
                    {
                        return i + temp;
                    }
                    head = deleteElement(head, i);
                    temp++;
                }
            }
        }
        if(head.length < 3)
        {
            for (int i=0; i < 3;i++)
            {
                if(head[i] == value)
                {
                    return i;
                }
            }
        }
        return  -1;
    }

    public static int[] deleteElement (int[] head, int delete)
    {
        int newHead[] = new int[head.length-1];
        for (int i = 0; i < newHead.length; i++)
        {
            if (i < delete)
            {
                newHead[i] = head[i];
            }
            else
            {
                newHead[i] = head[i+1]; //copies the next element
            }
        }
        return newHead;
    }
}

