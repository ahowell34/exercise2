//Alysyn Howell 1/21/20 Prog Fundamentals for Android
package com.company.Howell;

public class Main {

    public static void main(String[] args) {
        String[] week = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        int rain[] = {95, 60, 25, 5, 0, 75,90};

        for(int j = 0; j < temp.length; j++){
            if (temp[j] <= 32 && rain[j] > 50){
                System.out.println(temp[j] + " " + rain[j] + " " + week[j]);
            }
        }
    }
}
