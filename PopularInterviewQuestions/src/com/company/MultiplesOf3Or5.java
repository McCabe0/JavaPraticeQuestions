package com.company;

public class MultiplesOf3Or5 {

    public int sumOfNumbers(){

        int sum = 0;
        for(int i = 0; i<100; i++){
            if ((i % 3) == 0 | (i % 5) == 0)
                sum = sum + i;
        }
        return sum;
    }

}
