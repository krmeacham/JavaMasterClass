package com.company;

public class Main {

    public static void main(String[] args) {

                byte myByteValue = 100;

                short myShortValue = 1000;

                int myIntValue = 100000;

                long myLongValue = 50000L + (10L * (myByteValue + myShortValue + myIntValue));


                System.out.println("The long value is " + myLongValue);
            }
        }
