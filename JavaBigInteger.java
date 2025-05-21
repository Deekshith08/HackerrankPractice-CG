import java.io.*;

import java.math.*;


public class JavaBigInteger {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));

    }
}