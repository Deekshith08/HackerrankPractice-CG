import java.io.*;
import java.util.*;


public class JavaEndOfFile {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        int id = 1;
        while(sc.hasNext()){
            line = sc.nextLine();
            System.out.println(id++ + " " + line);
        }
    }
}