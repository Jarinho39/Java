package com.JarekKudelka;

public class Main {

    public static void main(String[] args) {

        // int has a widt of 32
	    int myMinValue= 2.147.483.648;
        int myMaxValue= 2.147.483.647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal="+ myTotal);

        // byte has a widh of 8
        byte mybyteValue = -128;
        byte myNewByteValue = (byte)(mybyteValue/2);
        System.out.println("myNewByteValue="+myNewByteValue);

        // short has a widt of 16
        short myShortValue = 32767;
        short myNewShortValue= (short) (myShortValue/2);
        System.out.println("myNewShortValue="+ myNewShortValue);
        //long has a widt of 64
        long myLongValue =(long) 9_234_373_865_854_445_897L ;
    }
}
