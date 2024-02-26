package com.sagar.cabapp;


public class CabInvoice {
    static double perKm=10;
    static double perMin=1;
    static double minFare=5;
    public static void main(String[] args) {
        double res=totalFare(2,5);
        System.out.println(res);
        System.out.println(multiplerides(2,5,5));
        System.out.println(enhancedInvoice(2,5,5));
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
}
