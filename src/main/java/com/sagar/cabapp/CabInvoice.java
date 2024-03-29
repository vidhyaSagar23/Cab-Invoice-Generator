package com.sagar.cabapp;


import java.util.HashMap;
import java.util.Scanner;

public class CabInvoice {
    static double perKm=10;
    static double perMin=1;
    static double minFare=5;
    public static void main(String[] args) {
        double res=totalFare(2,5);
        System.out.println(res);
        System.out.println(multiplerides(2,5,5 ));
        System.out.println(enhancedInvoice(2,5,5));
        System.out.println(invoiceService(2,5,5));
        System.out.println(premiumRides("premium",2,5));
    }

    public static double totalFare(double dist, int time) {
        double res=dist*perKm + time*perMin;
        if(res>minFare){
               return res;
        }
        else{
            return minFare;
        }
    }
    public static double multiplerides(double dist, int time, int rides)
    {
        double res=(dist*perKm + time*perMin)*rides;
        if(res>minFare){
            return res;
        }
        else{
            return minFare;
        }
    }

    public static double enhancedInvoice(double dist, int time, int rides){
        double res=(dist*perKm + time*perMin)*rides;
        double avg=res/rides;
        return avg;
    }
    public static double invoiceService(double dist, int time, int id)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,5);
        map.put(2,4);
        map.put(5,3);
        double res=0;
        if(map.containsKey(id)){
             res=(dist*perKm + time*perMin)*map.get(id);
        }
        return res;
    }

    public static double premiumRides(String category,int dist,int min){
        if (category.equalsIgnoreCase("normal")){
            int minFare=5;
            int fare=10;
            int time=1;
            double res=dist*fare + time*min;
            if (res>minFare){
                return res;
            }
            else{
                return minFare;
            }
        }
        else{
            int minFare=20;
            int fare=15;
            int time=2;
            double res=dist*fare + time*min;
            if (res>minFare){
                return res;
            }
            else{
                return minFare;
            }
        }
    }
}
