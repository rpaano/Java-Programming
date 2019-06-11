//Single Line comment
/*
 *vsvsvs
*/

import java.util.Scanner;
import java.util.*;

public class Animal{

    public static final double FAVNUMBER = 1.345;

    private String name;

    private int weight;
    //true or false
    private boolean hasOwner = false;
    // -28 TO 127 value
    private byte age;
    //-2^63 to 2^63
    private long uniqueID;

    private char favoriteChar;
    //64 bit number
    private double speed;
    //32 bit
    private float height;

    //can only be acces to the same package
    protected static int numberOfAnimals = 0;

    static Scanner userinput = new Scanner(System.in);

    public Animal(){
        numberOfAnimals++;

        int sumOfNumber = 5 + 1;

        System.out.print("5 + 1 = " + sumOfNumber);

        int diffOfNumber = 5 - 1;

        System.out.print("5 - 1 = " + diffOfNumber);

        int multiOfNumber = 5 * 1;

        System.out.print("5 * 1 = " + multiOfNumber);

        int divOfNumber = 5 / 1;

        System.out.print("5 / 1 = " + divOfNumber);

        int modOfNumber = 5 / 1;

        System.out.print("5 / 1 = " + modOfNumber);
    }

    public static void main(String[] args) {
        Animal theAnimal = new Animal();

    
    }

}