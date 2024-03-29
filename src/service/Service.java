package service;

import model.Model;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Integer> numbers = new ArrayList<>();

    public int getFibonacciLength(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return getFibonacciLength(number - 1) + getFibonacciLength(number - 2);
        }
    }

    public List<Integer> getFib(int first, Model number) {
        for (int i = first; i <= number.getNumber(); i++) {
            numbers.add(getFibonacciLength(i));
        }
        return numbers;
    }


}
