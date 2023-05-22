package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
public class Free {
    public String[] num;
    public void printnum(int n) {
        switch (n) {
            case 0:
                num[0] += "■■■■■　";
                num[1] += "■　　　■　";
                num[2] += "■　　　■　";
                num[3] += "■　　　■　";
                num[4] += "■■■■■　";
                break;
            case 1:
                num[0] += "　　■　　　";
                num[1] += "　■■　　　";
                num[2] += "　　■　　　";
                num[3] += "　　■　　　";
                num[4] += "■■■■■　";
                break;
            case 2:
                num[0] += "■■■■■　";
                num[1] += "　　　　■　";
                num[2] += "■■■■■　";
                num[3] += "■　　　　　";
                num[4] += "■■■■■　";
                break;
            case 3:
                num[0] += "■■■■■　";
                num[1] += "　　　　■　";
                num[2] += "■■■■■　";
                num[3] += "　　　　■　";
                num[4] += "■■■■■　";
                break;
            case 4:
                num[0] += "■　　　■　";
                num[1] += "■　　　■　";
                num[2] += "■■■■■　";
                num[3] += "　　　　■　";
                num[4] += "　　　　■　";
                break;
            case 5:
                num[0] += "■■■■■　";
                num[1] += "■　　　　　";
                num[2] += "■■■■■　";
                num[3] += "　　　　■　";
                num[4] += "■■■■■　";
                break;
            case 6:
                num[0] += "■■■■■　";
                num[1] += "■　　　　　";
                num[2] += "■■■■■　";
                num[3] += "■　　　■　";
                num[4] += "■■■■■　";
                break;
            case 7:
                num[0] += "■■■■■　";
                num[1] += "■　　　■　";
                num[2] += "　　　■　　";
                num[3] += "　　■　　　";
                num[4] += "　■　　　　";
                break;
            case 8:
                num[0] += "■■■■■　";
                num[1] += "■　　　■　";
                num[2] += "■■■■■　";
                num[3] += "■　　　■　";
                num[4] += "■■■■■　";
                break;
            case 9:
                num[0] += "■■■■■　";
                num[1] += "■　　　■　";
                num[2] += "■■■■■　";
                num[3] += "　　　　■　";
                num[4] += "■■■■■　";
                break;
        }
    }
    @GetMapping("/lotto")
    public String getlotto() {
        num = new String[]{"", "", "", "", ""};
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        //numbers.subList(0, 6);
        Integer[] arr = numbers.toArray(new Integer[6]);
        for(int i = 0; i < 6; i++) {
            //System.out.println(arr[i]);
            if(arr[i] < 10) {
                printnum(arr[i]);
            } else {
                printnum(arr[i] / 10);
                printnum(arr[i] % 10);
            }
            if(i < 5) {
                num[0] += "　　　";
                num[1] += "　　　";
                num[2] += "　　　";
                num[3] += "　　　";
                num[4] += "■　　";
            }
        }
        StringBuilder response = new StringBuilder();
        for(int i = 0; i < 5; i++)
            response.append(num[i]).append("<br>");

        return response.toString();
    }
}
