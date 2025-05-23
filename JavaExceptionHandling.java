import java.io.*;
import java.util.*;

public class JavaExceptionHandling {

    public static long power(int a, int b) throws Exception{
        if(a<0 || b<0) throw new Exception("n or p should not be negative.");
        else if(a==0 && b==0) throw new Exception("n and p should not be zero.");
        return (long)Math.pow(a,b);
    }

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a = 0;
        int b = 0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            a = input.nextInt();
            b = input.nextInt();
            try{
                System.out.println(power(a,b));
            }
            catch(Exception e){
                System.out.println(e);
            }

        }


    }
}