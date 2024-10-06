package recursion;

public class BinarySum {

    int binarySum(int A[], int i, int n)
    {
        if (n == 1)
            return A[i];
        else
            return binarySum(A, i, n/2 ) + binarySum(A, i + n/2, n/2 );
    }

}
