package recursion;

public class Main {

    public static void main(String[] args) {
        Factorial factorialObject = new Factorial();
        Integer factorial = factorialObject.recursionFactorial(5);
        System.out.println("Factorial: " + factorial);

        int A[] = {1,2,3,4,5,6,7,8};
        BinarySum binarySumObject = new BinarySum();
        int binSum = binarySumObject.binarySum(A, 0, 8);
        System.out.println("Binary Sum: " + binSum);
    }
}
