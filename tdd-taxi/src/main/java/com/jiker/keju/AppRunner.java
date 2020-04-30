package com.jiker.keju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
//        String testDataFile = args[0];
        String receipt = "";

        FileUtile fileUtile = new FileUtile();
        Calculation calculation = new Calculation();
        List<String> a = new ArrayList<String>();
        try {
            a =  fileUtile.readConfig("testData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < a.size(); i++) {
            receipt = calculation.getNumbers(a.get(i));
        }
        System.out.println("四大基本记录卡");
        System.out.println(receipt);
    }
}
