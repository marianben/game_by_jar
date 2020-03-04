package com.example.logos_task_oop.Lorety;

import java.util.Random;
import java.util.Scanner;

public class Lotery {

    public static void main(String[] args) {

        // input  number wiith user
        System.out.println("Input 6 number(with 6 to 54)");
        Scanner sc = new Scanner(System.in);
        String input_number = sc.next();
        String [] input_string_number = input_number.split(",");

        // app do rozigrash and inpunt 6 number
        int [] mass_with_number = new int[6];
        Random random = new Random();
        int  ChysloRozigrash = 0;
        while (ChysloRozigrash!=6){
            boolean same_number = false;
            int thisNumber = random.nextInt(54)+1;
            for (int is_same_number:mass_with_number) {
                if(is_same_number==thisNumber){
                    same_number=true;
                    break;
                }
            }
            if(same_number!=true) {
                mass_with_number[ChysloRozigrash ++] = thisNumber;
                }
            }
            
        // do perevirky
        int same = 0;
        for (int k = 0; k < input_string_number.length; k++) {
            int chyslo = Integer.parseInt(input_string_number[k]);
            for (int winner_number:mass_with_number){
                if(chyslo==winner_number){
                   same++;
                }
            }
        }
        //input result
        String all_number_rozigrashu  = "";
        for (int Chuslo: mass_with_number) {
            all_number_rozigrashu = all_number_rozigrashu + Chuslo + " ";
        }
        System.out.println( "In this game same = ("+all_number_rozigrashu+"):"+same);





    }

}
