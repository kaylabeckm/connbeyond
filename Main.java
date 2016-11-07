package acm.graphics;

import java.util.Scanner;

/**
 * Created by kayla on SundayNov/6/2016.
 */
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String entry;
        int iter;
        double angle;

        System.out.println("Input your L-System whatchamacallit");
        entry = scanner.nextLine();
        System.out.println("What angle do you want to use?");
        angle = scanner.nextDouble();
        System.out.println("How many times do you want to iterate?");
        iter = scanner.nextInt();

        LSys lsys = new LSys(entry,angle,iter);
    }


}


