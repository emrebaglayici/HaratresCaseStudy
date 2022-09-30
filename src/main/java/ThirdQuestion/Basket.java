package ThirdQuestion;

import Exceptions.InvalidConstraintException;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Basket {

    public void calculateBasket(Integer[] products) throws InvalidConstraintException {
        checkArraySize(products);
        checkElementInArray(products);
        Integer[] noDiscount = new Integer[products.length];
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            if (i != products.length - 1) {
                if (products[i] > products[i + 1]) {
                    products[i] = products[i] - products[i + 1];
                } else {
                    noDiscount[i] = products[i];
                }
            } else {
                noDiscount[i] = products[i];
            }
            total += products[i];
        }
        System.out.println("Total : " + total);
        Stream<Integer> sorted = Arrays.stream(Arrays.stream(noDiscount).filter(Objects::nonNull).toArray(Integer[]::new)).sorted();
        sorted.forEach(s -> System.out.print(s + " "));
    }
    public void checkArraySize(Integer[] products) throws InvalidConstraintException {
        if (products.length<=1 || products.length>=100){
            throw new InvalidConstraintException("Range must be (1 < n < 100)");
        }
    }
    public void checkElementInArray(Integer[] products) throws InvalidConstraintException {
        for (Integer product:products){
            if (product<=0 || product>=2000){
                throw new InvalidConstraintException("Range must be (0 < i < 2.000)");
            }
        }
    }
    public static void main(String[] args) throws InvalidConstraintException {
        Basket basket = new Basket();
        Integer[] products = {5, 6, 4, 3, 4};
        basket.calculateBasket(products);
    }
}
