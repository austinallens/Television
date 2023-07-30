/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 4.1
 * File Name: MyTelevisions.java
 */

//

import java.util.Scanner;

public class MyTelevisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Television tV1, tV2, tV3;
        
        //Instantiates and prints three Television objects
        tV1 = new Television();
        System.out.println("Enter TV one information: ");
        tV1.setPrice(sc.nextDouble());
        sc.nextLine();
        tV1.setBrand(sc.nextLine());
        tV1.setScreenSize(sc.nextInt());
        
        tV2 = new Television();
        System.out.println("Enter TV two information: ");
        tV2.setPrice(sc.nextDouble());
        sc.nextLine();
        tV2.setBrand(sc.nextLine());
        tV2.setScreenSize(sc.nextInt());
        
        tV3 = new Television();
        System.out.println("Enter TV three information: ");
        tV3.setPrice(sc.nextDouble());
        sc.nextLine();
        tV3.setBrand(sc.nextLine());
        tV3.setScreenSize(sc.nextInt());
        
        System.out.println(tV1 + " " + tV2 + " "
                + tV3);
    }
}
