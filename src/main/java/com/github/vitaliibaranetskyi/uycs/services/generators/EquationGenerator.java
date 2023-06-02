package com.github.vitaliibaranetskyi.uycs.services.generators;

import org.springframework.stereotype.Service;
import com.github.vitaliibaranetskyi.uycs.models.Equation;

import java.util.ArrayList;

@Service
public class EquationGenerator {

    public ArrayList<String> createRandomEquationArray(int size) {
        ArrayList<String> arr = new ArrayList<>();
        if (size == 0) {
            return new ArrayList<>();
        } else {
            arr.add(Integer.toString(new RandomNumberGenerator().createRandomNumber()));
            for (int i = 0; i < size; i++) {
                arr.add(new RandomOperationGenerator().createRandomOperation());
                arr.add(Integer.toString(new RandomNumberGenerator().createRandomNumber()));
            }
            return arr;
        }
    }

    public Equation createEquationFromArray(ArrayList<String> arr) {
        arr = validateDivisionAndUpdateEquationArray(arr);
        Equation equation = new Equation();
        equation.setArray(new ArrayList<>(arr));
        int i = 0;

        while (i < arr.size()) {
            String operator = arr.get(i);
            if (operator.equals("*") || operator.equals("/")) {
                performOperation(arr, i, operator);
                i = 0;
            } else {
                i++;
            }
        }

        i = 0;
        while (i < arr.size()) {
            String operator = arr.get(i);
            if (operator.equals("+") || operator.equals("-")) {
                performOperation(arr, i, operator);
                i = 0;
            } else {
                i++;
            }
        }

        equation.setInitialAnswer(Float.parseFloat(arr.get(0)));
        return equation;
    }

    private float validateDivision(float a, float b) {
        if (b == 0) {
            b = new RandomNumberGenerator().createRandomNumberWithoutZero();
        }
        while ((a / b) % 0.5 > 0) {
            b = new RandomNumberGenerator().createRandomNumberWithoutZero();
        }
        return b;
    }

    private ArrayList<String> validateDivisionAndUpdateEquationArray(ArrayList<String> arr) {
        float firstNum;
        float secondNum;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)
                   .equals("/")) {
                firstNum = Float.parseFloat(arr.get(i - 1));
                secondNum = Float.parseFloat(arr.get(i + 1));
                secondNum = validateDivision(firstNum, secondNum);
                if ((secondNum * 10) % 10 == 0) {
                    int intSecondNum = (int) secondNum;
                    arr.set(i + 1, Integer.toString(intSecondNum));
                } else {
                    arr.set(i + 1, Float.toString(secondNum));
                }
            }
        }
        return arr;
    }

    private void performOperation(ArrayList<String> arr, int index, String operator) {
        float firstNum = Float.parseFloat(arr.get(index - 1));
        float secondNum = Float.parseFloat(arr.get(index + 1));
        float result;

        switch (operator) {
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            default:
                return;
        }

        arr.subList(index - 1, index + 2).clear();
        arr.add(index - 1, Float.toString(result));
    }
}
