import java.util.*;

class Sieve{
    
    static boolean[] sieve(int n) {
        boolean [] isNotPrime = new boolean[n + 1];
        // Arrays.fill(isNotPrime, true);
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (isNotPrime[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        return isNotPrime;
    }
}