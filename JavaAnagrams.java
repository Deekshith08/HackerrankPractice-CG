import java.io.*;
import java.util.*;

public class JavaAnagrams {

    public static boolean checkAnagram(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        boolean res = checkAnagram(a,b);
        if(res) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}