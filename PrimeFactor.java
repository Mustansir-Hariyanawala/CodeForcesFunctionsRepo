import java.util.ArrayList;

public class PrimeFactor {
    static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2)
            factors.add(n);

        return factors;
    }

    static void primeFactors(int n, int arr[]) {
        while (n % 2 == 0) {
            arr[2] = 1;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                arr[i] = 1;
                n /= i;
            }
        }
        if (n > 2)
            arr[n] = 1;
    }

    static boolean checkPrimeFactors(int n, int arr[]) {
        while (n % 2 == 0) {
            if(arr[2] == 1) return true;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                if(arr[i] == 1) return true; 
                n /= i;
            }
        }
        if (n > 2 && arr[n] == 1) return true;
            
        return false;
    }
}
