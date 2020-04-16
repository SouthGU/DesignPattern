package DDT;
import java.util.*;
/**
 * @Auther: sise.xgl
 * @Date: 2020/4/9/10:06
 * @Description:
 */

public class GeneratePrimes
{
    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue >= 2)
        {
            int sizeOfArray = maxValue + 1;
            boolean[] ipPrime = new boolean[sizeOfArray];
            int i;
            for (i = 0; i < sizeOfArray; i++)
                ipPrime[i] = true;
            ipPrime[0] = ipPrime[1] = false;
            int j;
            for (i = 2; i < Math.sqrt(sizeOfArray) + 1; i++)
            {
                for (j = 2 * i; j < sizeOfArray; j += i)
                    ipPrime[j] = false;
            }
            int count = 0;
            for (i = 0; i < sizeOfArray; i++)
            {
                if (ipPrime[i])
                    count++;
            }
            int[] primes = new int[count];
            for (i = 0, j = 0; i < sizeOfArray; i++)
            {
                if (ipPrime[i])
                    primes[j++] = i;
            }
            return primes;
        }
        else
            return new int[0]; 
    }
}
