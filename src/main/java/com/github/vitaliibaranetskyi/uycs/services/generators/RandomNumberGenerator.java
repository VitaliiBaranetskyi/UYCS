package com.github.vitaliibaranetskyi.uycs.services.generators;

public class RandomNumberGenerator {

    public int createRandomNumber() {
        return (int) (10 * Math.random());
    }

    public int createRandomNumberWithoutZero() {
        int num = createRandomNumber();
        if (num == 0) {
            num = createRandomNumberWithoutZero();
        }
        return num;
    }
}
