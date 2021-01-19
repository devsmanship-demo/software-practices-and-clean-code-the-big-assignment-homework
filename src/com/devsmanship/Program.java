package com.devsmanship;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println("NO ACTION");
            return;
        }
        String action = args[0];

        if(action.equals("report")) {
            new Start().start();
            wqdqwd
                    dqw
        } else {
            if(action.equals("save")) {
                new Car_Service().save();
            } else {
            }
        }
    }
}
