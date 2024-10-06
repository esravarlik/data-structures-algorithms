package recursion;

public class Factorial {

    public Integer recursionFactorial(int x){
        if(x == 0)
            return 1;
        else return x*recursionFactorial(x-1);
    }
}
