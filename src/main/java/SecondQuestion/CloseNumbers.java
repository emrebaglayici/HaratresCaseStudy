package SecondQuestion;

import Exceptions.InvalidConstraintException;

import java.util.Arrays;

public class CloseNumbers {
    public static final Integer MIN_RANGE = -20000;
    public static final Integer MAX_RANGE = 20000;

    public void checkNumbers(Integer[] numbers) throws InvalidConstraintException {
        for (Integer number : numbers) {
            if (number <= MIN_RANGE || number >= MAX_RANGE) {
                throw new InvalidConstraintException("Range must be (-20.000 < i < 20.000 )");
            }
        }
    }
    public void checkArraySize(Integer[] numbers) throws InvalidConstraintException {
        if (numbers.length <= 1 || numbers.length >= 1000) {
            throw new InvalidConstraintException("Range must be (1 < n < 1000)");
        }
    }

    public String[] findCloseNumbers(Integer[] numbers) throws InvalidConstraintException {
        checkArraySize(numbers);
        checkNumbers(numbers);
        String[] result = new String[numbers.length];
        Arrays.sort(numbers);
        int minDifference = Integer.MAX_VALUE;
        int diff;
        //Finding minimum difference
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                diff = Math.abs(numbers[i] - numbers[i + 1]);
                if (diff == 0)
                    continue;
                if (Math.abs(diff) <= minDifference) {
                    minDifference = Math.abs(numbers[i] - numbers[i + 1]);
                }
            }
        }
        //Finding numbers that have minimum difference between them
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1 && Math.abs(numbers[i] - numbers[i + 1]) == minDifference) {
                result[i] = numbers[i] + " " + numbers[i + 1];
            }
        }
        return result;
    }
    public void printResult(String[] result) {
        for (String s : result) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) throws InvalidConstraintException {
        CloseNumbers closeNumbers = new CloseNumbers();
        Integer[] arr = {3, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        closeNumbers.printResult(closeNumbers.findCloseNumbers(arr));
    }
}
