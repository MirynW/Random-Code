/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdeci;

/**
 *
 * @author miryn
 */
public class ReadDeci {

public static double readNum() throws Exception
        {
            char asciiNum;
            int digitNum;
            int counter = 0;
            double first = 0.0;
            double second = 0.0;
            double result;
            boolean isNeg = false;
            
            asciiNum = (char)System.in.read();
            while (asciiNum != '.')
            {
                if ( asciiNum == '-')
                {
                    isNeg = true;
                    asciiNum = (char)System.in.read();
                }
                digitNum = asciiNum - '0';
                first = first * 10 + digitNum;
                asciiNum = (char)System.in.read();
            }
            asciiNum = (char)System.in.read();
            while(asciiNum != '\n')
            {
                digitNum = asciiNum - '0';
                second = (second * 10 + digitNum);
                asciiNum = (char)System.in.read();
                counter++;
            }
            while(counter > 0)
            {
                second = second/10;
                counter = counter - 1;
            }
            result = first + second;
            if ( isNeg == true)
                result = result * -1;
            return result;
        }
public static double doLog(int base, int outcome)
{
    while (base != outcome)
    {
        
    }
}
public static double readLog() throws Exception
{
    String Log = "log";
    char asciiNum;
    boolean haveResult;
    int digitNum;
    int counter = 0;
    int base = 0;
    int outcome = 0;
    double result;
    
   asciiNum = (char)System.in.read();
   while (asciiNum != '_')
   {
       if (counter == 3 && Log.equals("log"))
           haveResult = true;
       else if (counter == 3 && !(Log.equals("log")))
               {
                   haveResult = false;
               }
       else 
       {
           asciiNum = (char)System.in.read();
           counter++;
       }
   }
   asciiNum = (char)System.in.read();
   while ( asciiNum != '(')
   {
       digitNum = asciiNum - '0';
       base = base * 10 + digitNum;
       asciiNum = (char)System.in.read();
   }
   asciiNum = (char)System.in.read();
   while ( asciiNum != ')')
   {
       digitNum = asciiNum - '0';
       outcome = outcome*10 + digitNum;
       asciiNum = (char)System.in.read();
   }
       
    
}
    public static void main(String[] args) {
        // TODO code application logic here
        double user = 0.0;
        System.out.println("Please enter a number");
        try{
            user = readNum();
        }
        catch ( Exception e)
        {
            System.out.println("Keyboard error");
        }
        System.out.println(user);
    }
    
}
