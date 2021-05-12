import java.util.ArrayList;

//build a program that creates an ArrayList of all prime numbers in an array.

public class PrimeDirective {

  public ArrayList<Integer> onlyPrimes(int[] numbers) {

    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        // add number to primes
        primes.add(number);
      }
    }
    return primes;
  }

  // method to check if a num is prime
  public boolean isPrime(int number) {

    // if n%n ==0 -- true
    // if n%n
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    // f n is prime, then n should not be divisible by any integers between 2 and
    // n-1.
    for (int i = 2; i < number; i++) {

      if (number % i == 0) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    // System.out.println(pd.isPrime(7));
    // System.out.println(pd.isPrime(28));
    // System.out.println(pd.isPrime(2));
    // System.out.println(pd.isPrime(0));

    int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };

    System.out.println(pd.onlyPrimes(numbers));

  }
}