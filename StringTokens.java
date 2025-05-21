import java.io.*;
import java.util.*;

public class StringTokens {

    public static void splitText(String text){
        String[] arr = text.split("[^a-zA-Z]+");
        int count = 0;
        for(String s : arr){
            if(!s.isEmpty()) count++;

        }
        System.out.println(count);
        for(String s: arr){
            if(!s.isEmpty()) System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        splitText(text);
    }
}