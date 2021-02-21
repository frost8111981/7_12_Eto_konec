package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();


        while (true) {
            String input = reader.readLine();

            if (input.equals("end")){
                break;
            }
            list.add(input);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // write your code here
    }
}
