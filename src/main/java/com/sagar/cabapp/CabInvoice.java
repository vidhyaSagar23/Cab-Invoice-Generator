package com.sagar.cabapp;


public class CabInvoice {
    static double perKm=10;
    static double perMin=1;
    static double minFare=5;
    public static void main(String[] args) {
        double res=totalFare(2,5);
        System.out.println(res);
    }

    private static double totalFare(int dist, int time) {
        double res=dist*perKm + time*perMin;
        if(res>minFare){
            return res;
        }
        else{
            return minFare;
        }
    }
}
