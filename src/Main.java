/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        int sumNum = 0;

        for (int i = 1 ; i <100;i++){
            if (isPrime(i)== true){
                sumNum+=i;
            }
        }
        System.out.println("the sum of number is: "+sumNum );
    }

    private static boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
