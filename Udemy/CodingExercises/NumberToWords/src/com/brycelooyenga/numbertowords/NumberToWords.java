package com.brycelooyenga.numbertowords;

public class NumberToWords {

    public static void numbertoWords(int number) {
        System.out.println(Reverse(number));

        }



    public static String Reverse(int number) {

        String numberString = String.valueOf(number);
        String backwards = ""; String newLetter;

        for (int i = numberString.length() -1; i >= 0; i--) {
            newLetter =String.valueOf(makeNumbersIntoWord(numberString.charAt(i)));
            if (i != 0) {
                backwards += newLetter + ", ";
            } else {
                backwards += newLetter;
            }

        }

   return backwards; }


   public static String numbertoLetters(String str) {
       String numberString = "";

       for (int i = 0; i < str.length(); i++) {

           char s = str.charAt(i);
               numberString +=makeNumbersIntoWord(s);

           }

       return numberString;       }



    public static String makeNumbersIntoWord(char x) {
        switch (x) {
            case '1':
                return "One";

            case '2':
                return "Two";

            case '3':
                return "Three";

            case '4':
                return "Four";

            case '5':
                return "Five";

            case '6':
                return "Six";

            case '7':
                return "Seven";

            case '8':
                return "Eight";

            case '9':
                return "Nine";

        }
   return null; }



}
