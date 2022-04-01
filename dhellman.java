

import java.util.*;
import java.lang.*;

class dhellman {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter p (prime number):");
        int p = sc.nextInt();
        System.out.println("Enter g (primitive root of "+p+" ):");
        int g = sc.nextInt();

        int min = 0;
        int max = p-1;

        double x = (double)(Math.random()*(min-max+1)+1);
        double y = (double)(Math.random()*(min-max+1)+1);

        double gx = Math.pow(g,x);
        double gy = Math.pow(g,y);

        double R1 = gx%p;
        double R2 = gy%p;

        double R2x = Math.pow(R2,x);
        double R1y = Math.pow(R1,y);

        int k1 = (int)(R2x%p);
        int k2 = (int)(R1y%p);

        System.out.println("Symmetric Key of Alice: "+k1);
        System.out.println("Symmetric Key of Bob: "+k2);



    }
    
}
