import java.io.*;
import java.util.*;


public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n1 = input.nextInt();
        for(int i=0; i<n1; i++){
            int ele = input.nextInt();
            list.add(ele);
        }
        int n2 = input.nextInt();
        for(int i=0; i<n2; i++){
            String a = input.next();
            if(a.toLowerCase().equals("insert")){
                int in1 = input.nextInt();
                int in2 = input.nextInt();
                list.add(in1,in2);
            }
            if(a.toLowerCase().equals("delete")){
                int in = input.nextInt();
                list.remove(in);
            }
        }
        for(int a: list){
            System.out.print(a + " ");
        }
    }
}