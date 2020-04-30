package com.jiker.keju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculation {
    private String receipt = "";

    public String getNumbers(String content) {
        String a = content.replaceAll("\\D+",",");
        List<String> result_list = new ArrayList<String>(Arrays.asList(a.split(",")));
        receipt = receipt+"收费"+valuation(Integer.valueOf(result_list.get(0)),Integer.valueOf(result_list.get(1)))+"元"+"\n";
        return receipt;
    }
    public int valuation(int kilometre,int minute){
        return (int) Math.rint(firstPart()+secondPart(kilometre)+threePart(kilometre)+minutePart(minute));
    }
    public int firstPart(){
        return 6;
    }
    public double secondPart(int kilometre){
        if(kilometre <= 2){
            return 0;
        }
        if(kilometre >8){
            return 6*0.8;
        }else {
            return (kilometre-2)*0.8;
        }
    }
    public double threePart(int kilometre){
        if(kilometre <= 8){
            return 0;
        }
        return (kilometre-8)*1.2;
    }
    public double minutePart(int minute){
        return minute*0.25;
    }
}
