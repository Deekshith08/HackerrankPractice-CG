import java.io.*;
import java.util.*;

public class JavaStringsIntro {
    public static String checkLexicography(String a, String b){

        if(a.compareTo(b)>0) return "Yes";
        else return "No";
    }
    public static String changeFormat(String a, String b){
        String ares = a.substring(0,1).toUpperCase() + a.substring(1);
        String bres = b.substring(0,1).toUpperCase() + b.substring(1);
        return ares+ " " + bres;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() + B.length();
        System.out.println(len);
        String checked = checkLexicography(A,B);
        System.out.println(checked);
        String res = changeFormat(A,B);
        System.out.println(res);


    }
}



