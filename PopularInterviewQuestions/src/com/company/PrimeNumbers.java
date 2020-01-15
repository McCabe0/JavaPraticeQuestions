package com.company;

public class PrimeNumbers {
   private int maxNumber = 100;
   private boolean isPrime = true;


   public int isPrimeNumber(){
       for (int i=1; i<=maxNumber; i++){
           isPrime = checkPrime(i);
           if (isPrime){
               System.out.println("Prime number: " + i);
           }
       }
       return 0;
   }
    public boolean checkPrime(int number) {
        int remainder;
        for (int i = 2; i<= 5; i++ ){
            remainder = (number % i);
            if (remainder == 0)
                return false;
        }
        return true;
    }
}