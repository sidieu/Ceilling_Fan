/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfan.control;

import java.util.Scanner;

/**
 *
 * @author sidieu
 */
public class HouseWithCeilingFan extends CeilingFan {

    public static void main(String args[]) {
        System.out.println("ceiling fan installed");
        HouseWithCeilingFan control = new HouseWithCeilingFan();
        if (control.getSpeed() == 0) {
            System.out.println("Use cord 1 to increase the speed and cord 2 to reverse the speed by decreasing it");
        }
        control.controlCeiling(control);

    }

    @Override
    void controlCeiling(CeilingFan fan) {
        System.out.println("Please tape '1' to pull cord 1 and '2' to pull cord 2");
        while (true) {
            Scanner scan = new Scanner(System.in);
            int act = scan.nextInt();
            if (act == 1) {
                fan.cord1();
            } else if (act == 2) {
                System.out.println("Fan reversed");
                fan.cord2();
            }
            if (fan.getSpeed() != 0) {
                System.out.println("Current running speed is : " + fan.getSpeed());
                System.out.println("Please tape '1' to continue to pull cord 1 and '2' to pull cord 2");
            } else {
                System.out.println("Fan is off");
            }
        }
    }

}
