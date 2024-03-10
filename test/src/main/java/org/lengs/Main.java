package org.lengs;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] part = new String[num];
        for (int i = 0; i < part.length; i++){
            part[i] = in.next();
        }
        int num_stuff = in.nextInt();
        String[] stuff = new String[num_stuff];
        boolean[] stuff_judge = new boolean[num_stuff];
        for (int i = 0; i < stuff.length; i++){
            stuff[i] = in.next();
            stuff_judge[i] = true;
        }
        for (int i = 0; i < stuff.length; i++){
            for (int j = 0; j < part.length; j++){
                if(!stuff[i].substring(0, 6).equals(part[j])){
                    stuff_judge[i]=false;
                    break;
                }
                int year = Integer.parseInt(stuff[i].substring(6,10));
                int month = Integer.parseInt(stuff[i].substring(10,12));
                int day = Integer.parseInt(stuff[i].substring(12,14));
                if (year < 1900 || year > 2023 || month < 1 || month > 12 || day < 1 || day >31){
                    stuff_judge[i]=false;
                    break;
                }
                if (month == 2){
                    if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0){
                        if(day >= 29){
                            stuff_judge[i]=false;
                            break;
                        }
                    }
                }
                int temp = -1;
                for (int i2 = 14; i2 < 17; i2++){
                    if (temp != Integer.parseInt(stuff[i].substring(i2,i2+1))){
                        temp = Integer.parseInt(stuff[i].substring(i2,i2+1));
                    }else {
                        System.out.println(Integer.parseInt(stuff[i].substring(i2,i2+1)));
                        stuff_judge[i] = false;
                        return;
                    }
                }
                temp = 0;
                for (int i3 = 0; i3 < 18; i3++){
                    temp+= Integer.parseInt(stuff[i].substring(i3,i3+1));
                }
                if(temp%8!=1){
                    stuff_judge[i] = false;
                }
                break;
            }
        }
        for (int i = 0; i < stuff.length; i++){
            if(stuff_judge[i]){
                System.out.println("ok");
            }else {
                System.out.println("error");
            }
        }
    }
}
/*
测试用例
2
123456
123457
1
123456202312120636
//
2
123456
123445
1
123456202312120636
 */