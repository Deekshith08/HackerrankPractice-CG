import java.util.*;


public class JavaArrayList {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0; i<n1; i++){
            List<Integer> list = new ArrayList<>();
            int n = input.nextInt();
            for(int j=0; j<n; j++){
                int in = input.nextInt();
                list.add(in);
            }
            lists.add(list);
        }

        int n2 = input.nextInt();
        for(int i=0; i<n2; i++){
            int outer = input.nextInt();
            int inner = input.nextInt();
            outer -= 1;
            inner -= 1;

            if(outer<lists.size()){
                List<Integer> list = lists.get(outer);
                if(inner<list.size()){
                    System.out.println(list.get(inner));
                }
                else System.out.println("ERROR!");
            }
            else System.out.println("ERROR!");

        }



    }
}