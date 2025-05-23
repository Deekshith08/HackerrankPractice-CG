import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner input = new Scanner(System.in)){
            int a = input.nextInt();
            int b = input.nextInt();
            int res = a/b;
            System.out.println(res);

        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}