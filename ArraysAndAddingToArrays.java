/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.adding.to.arrays;

/**
 *
 * @author miryn
 */
public class ArraysAndAddingToArrays {

int [] i = new int [] {1,2,3,4};    
    
public static boolean doesAdd(int [] list, int j) {
    //we recieve a list and a integer
    int count;
    int c;
    int counter;
    int num1;
    int num2;
    boolean breaker;
    breaker = false;
    counter = list.length;
    count = 0;
    c = 0;
    
    while (count <= counter && breaker == false);
    {
        while (((j-list[count]) != list[c]) && c < counter) // C Cannot equal count
        {
            c++;
            if ( c == count)
                c++;
        }
        if (c<counter) { num1 = count; num2 = c; breaker = true; }
        else { count++; }
    }
    if (breaker == true)
        return true;
   // I would like to return the two value that equaled j in the future.
    else
        return false;
    
}

    
    //Finding the multi of all values except i in array[x<i<k] without division.
//finding the []
//first we would take the array.length; 
//while (i<array.length)
//Then we would say that int k = 0; 
//if the array.length > 2;
//k++;
//int result = 1;
//we solve for int i; or array[i]
//first multi while (k<array.length)
//we will do result = array[k] * result;
//k++;
//end
//k--;
//while (k >=0)
//result = result * array[k]
//k--;
//end
//i++;
//end
//return result; or new array @ array.length, new array [i] = result;
//This ensures that there the original array is stored as to not mess up the multiplication
//each time we hit return, we would place the value into a new array that is the same size as array.length. Each value would be placed into the same slot as i
    public static void main(String[] args) {

    }
    
}
