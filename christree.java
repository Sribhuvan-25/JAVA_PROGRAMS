package com.company;


// This program prints a christmas tree taking the number of segemnts and the height from the user.



public class christree {
    public static void main(String[] args) {
        christree_build(4, 4); // Calling the method to print the christmas tree with the number of segments and height specified

    }
     // This method builds a christmas tree
    // @parameter segments Specifies number of segments height Specifies the height
    public static void christree_build(int segements, int height) {
        int spaces = height + segements - 1; // Number of spaces in each line
        int initial_asterisk = 1; // Number of asterisks
        int i = 1;
        while (i <= segements) { // Loop to print the segments

            int spaces_1 = spaces; //
            int initial_asterisk_a = initial_asterisk;
            for (int a = 1; a <= height; a++) { // Loop to print each line of the segment
                for (int b = spaces_1 - 1; b >= 0; b--) { // Loop for the spaces in each line
                    System.out.print(" ");
                }

                for (int c = 1; c <= initial_asterisk_a; c++) { // Loop for the number of asterisks in each line
                    System.out.print("*");
                }
                System.out.println();
                initial_asterisk_a += 2; // Number of asterisks are increased
                spaces_1--; // Spaces are reduced by one
            }
            spaces -=1;
            initial_asterisk += 2;
            i++;

        }
        for (int b = segements+height-2; b >= 0; b--) { // Loop for the spaces in the line of the base
            System.out.print(" ");
        }
        System.out.println("*");
        for (int b = segements+height-2; b >= 0; b--) { // Loop for the spaces in the line of the base
            System.out.print(" ");
        }
        System.out.println("*");
        for (int b = segements+height-5; b >= 0; b--) { // Loop for the spaces in the last line of the base
            System.out.print(" ");
        }
        System.out.println("*******");

    }
}

