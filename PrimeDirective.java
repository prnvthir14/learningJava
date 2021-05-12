//build a program that creates an ArrayList of all prime numbers in an array.

public class PrimeDirective {

  // method to check if a num is prime
  public boolean isPrime(int number) {

    // if n%n ==0 -- true
    // if n%n
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    for (int i = 2; i < number; i++) {

      if (number % i == 0) {
        return false;
      }
    }
    return true;

  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));

  }
}