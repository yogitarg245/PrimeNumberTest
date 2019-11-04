package com.yogi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {
    public boolean isPrimeNumber(int num) {

        return IntStream.rangeClosed(2,num/2)
                .noneMatch(x->x%2==0);
       /* if(num%2==0){
            return true;
        }
        return false;*/
    }
}
