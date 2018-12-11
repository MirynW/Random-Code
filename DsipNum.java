/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsip;

/**
 *
 * @author miryn
 */
public class DsipNum {
public static int readNum() throws Exception
        {
            int number = 0;
            int digitNumber = 0;
            char digitAscii = '0';
            
            digitAscii = (char)System.in.read();
            
            while ( digitAscii != '\n')
            {
                digitNumber = digitAscii - '0';
                number = number * 10 + digitNumber;
                digitAscii = (char)System.in.read();
            }
            return number;
        }

public static boolean Primes (int num)  //Finds if a number is prime
{
    int counter = 2;
    boolean result = true;
    
    while ( num > counter && result == true)
    {
        if ( num%counter == 0)
            result = false;
        counter++;
            
    }
    return result;
}

public static boolean Squares (int num) //Finds if a number is a perfect square
{
    int counter = 1;
    boolean result = false;
    
    while ( num > counter && result == false)
    {
        if ( num == counter * counter)
            result = true;
        else
            counter++;
    }
    return result;
}

public static boolean Digits (int num, int lastDigit)   //Finds if a number ends on a certain number
{
    boolean result;
    int remainder = num%10;
    if ( remainder == lastDigit)
        result = true;
    else
        result = false;
    
    return result;
}

public static boolean Factors ( int num, int factorAmount)  //Finds a if a number has a certain amount of factors
{
    int count = 1;
    int counter = 0;
    boolean result = false;
    
    while ( num > count && result == false)
    {
        if ( counter == factorAmount )
            result = true;
        else if ( num%count == 0 )
        {
            counter++;
            count++;
        }
        else 
            count++;
    }
    return result;
}
/*public static String Choices () throws Exception        //This is an unused subprogram that can combine characters into strings, maybe we can use this later?
{
    String combined = "";
    char contained = 0;
    
    contained = (char)System.in.read();
    
    while ( contained != '\n' ) 
    {
        combined = combined + contained;
        contained = (char)System.in.read();
    }
 return combined;
}
*/

    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        boolean isPrime = false;
        boolean isSeven = false;
        boolean isFive = false;
        boolean isSquare;
        char userAnswer = 'y';
        boolean giveNum = true;
        char[] array = new char[]{'E','F','G','H','Z'}; //Arrays are just easier to work with :(
        char choice = 0;
        
        while ( userAnswer == 'y')
        {
            try
            {
                System.out.println("Please enter a number");
                number = readNum();
                
                count = number - 1;
                System.out.println("What do you want to do?\n(A:Find a last digit of 7\nB:Find all prime numbers\nC:Find all numbers with 5 factors\nD:Find all square numbers");
                //choice = Choices();
                    choice = (char)System.in.read();
                    while (choice != '\n')                                  //@ This part of the code can probably be translated into a subprogram at some point. However I do not understand how outputs will work with subprograms and if I could possibly input an array either.
                    {
                        if (choice == 'A')
                            array[0] = 'A';
                        else if (choice == 'B')
                            array[1] = 'B';
                        else if (choice == 'C')
                            array[2] = 'C';
                        else if (choice == 'D')
                            array[3] = 'D';
                        choice = (char)System.in.read();
                    }
                
                while ( count > 0)
                {
                    isSeven = Digits(count, 7);                         //Still need to find a more efficient method. CHECK if and only if user choice demands it
                    isPrime = Primes(count);
                    isFive = Factors(count, 5);
                    isSquare = Squares(count);
                   
                    //we want to take user choice and allow it to work for any amount of inputs
                    //so what should happen is if the userinput = something it will
                        if (array[0] == 'A' && isSeven == false)        //using an array that stores a character over another one, we can compare certain characters easier to determine the user's choice.
                            giveNum = false;                                    //Can we use an if statement inside another if statement as to check if isSeven = false and then to change giveNum to this value
                        else if (array[1] == 'B' && isPrime == false)
                            giveNum = false;
                        else if (array[2] == 'C' && isFive == false)
                            giveNum = false;
                        else if (array[3] == 'D' && isSquare == false)
                            giveNum = false;
                                                                                       //Ultimately this is useless, due to the fact that certain options shouldn't return anything at all. No Prime Number is Square, No square numbers end in seven and so on, ultimately giving them the option was useless,
                    if (giveNum == true)                                     //This was good practice in arrays and we can use this style of sorting later. see the note titled @
                        System.out.println(count);
                    count = count - 1;
                    giveNum = true;
                }
                    System.out.println("Want to go again?(y/n)");
                    userAnswer = (char)System.in.read();
                    System.in.read();
                    
             }
                catch ( Exception e)
                        {
                            System.out.println("Keyboard error");
                        break;
                        }
            array = new char[]{'E','F','G','H','Z'};
            }
        }
    }