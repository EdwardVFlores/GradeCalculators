package getgrade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * @author Edward Flores
 * Grade Calculator for economy class.
 * To use this just copy everything in gradebook and at the end type -1
 */

public class GetGrade{
    public static void main(String[] args){
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double totalFn=0.0;
        String thisIn = input.next();
        while(!"-1".equals(thisIn)){
            String[] newS;
            if(thisIn.contains("/")){
                newS = thisIn.split("/");
                if("50".equals(newS[1])){
                    double percent = (double) ((((double) Integer.parseInt(newS[0])) / 50) * 100);
                    if(percent > 89) totalFn += 5.0;
                    else if (percent > 79) totalFn += 4.0;
                    else if (percent > 69) totalFn += 3.5;
                    else if (percent > 59) totalFn += 3.0;
                    else if (percent > 49) totalFn += 2.5;
                } else {
                    totalFn += Integer.parseInt(newS[0]);
                }
            }
            thisIn = input.next();
        }
        System.out.print("\nGrade:\n");
        if(totalFn >= 225)System.out.print("A ("+totalFn);
        else if(totalFn >= 200)System.out.print("B ("+totalFn);
        else if(totalFn >= 175)System.out.print("C ("+totalFn);
        else if(totalFn >= 150)System.out.print("D ("+totalFn);
        else if(totalFn < 150)System.out.print("F ("+totalFn);
        System.out.println(")\n");
    }
}
