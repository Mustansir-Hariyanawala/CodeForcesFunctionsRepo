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

    
    static boolean[] sieve(long n1) {
        int n = (int)n1;
        boolean [] isNotPrime = new boolean[n + 1];
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

    static boolean[] sieve(long L, long R){
        long val = (long)Math.sqrt(R);
        boolean sieve[] = new boolean[(int)val + 1];
        List<Integer> list = new ArrayList<>();
        sieve[0] = sieve[1] = true;
        for(int i = 2; i <= val; i++){
            if(!sieve[i]){
                list.add(i);
                for(int j = i * i; j <= val; j += i){
                    sieve[j] = true;
                }
            }
        }
        boolean isPrime[] = new boolean[(int)R - (int)L + 1];
        for(int prime: list){
            for(int j = Math.max(prime * prime, (((int)L + prime - 1) /prime * prime)); j <= R; j += prime){
                isPrime[j - (int)L] = true; 
            }
        }

        if(L == 1) isPrime[0] = true;
        return isPrime;
    }
}