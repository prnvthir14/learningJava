public class Calculator {

  //Calculator methos
  public int mod(int a, int b) {

    int modResult = a % b;

    return modResult;

  }

  public int divide(int a, int b) {

    int divResult = a / b;

    return divResult;

  }

  public int product(int a, int b) {

    int multResult = a * b;

    return multResult;

  }

  public int subtract(int a, int b) {
    int subResult = a - b;

    return subResult;
  }

  public int add(int a, int b) {

    int addResult = a + b;

    return addResult;
  }

  // constructor method 
  public Calculator() {

  }
  //main with test cases
  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(1111,7));


  }

}