
public class Main {
    public static void main(String[] args) {
        System.out.println("args = " + calculateFactorial(4));
        System.out.println("args = " + calculateFactorial(12));
        System.out.println("args = " + calculateSumOfNumbersFrom1ToN(3));
        System.out.println("args = " + calculateSumOfNumbersFrom1ToN(10));
    }

    //Write a Java recursive method to calculate the factorial of a given positive integer.
    public static long calculateFactorial(int n){
        if(n <=0){
            return 1;
        }

        return calculateFactorial(n-1) * n;
    }

    //Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public static long calculateSumOfNumbersFrom1ToN(int n){
        if(n == 1){
            return 1;
        }
       return (calculateSumOfNumbersFrom1ToN(n-1) + n);
    }

}