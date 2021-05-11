public class CarLoan {

  // instance vars

  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;

  // METHOD TO CHECK VALID LOAN
  public void checkLoanValidity() {

    if (loanLength <= 0 || interestRate <= 0) {

      System.out.println("Error! You must take out a valid car loan.");

    } else if (downPayment >= carLoan) {
      System.out.println("You have the option to pay of the car in full. Lets chat");

    } else {
      int remainingBalance = carLoan - downPayment;
      int loanInMonths = loanLength * 12;
      int monthlyBalance = remainingBalance / loanInMonths;
      int interest = monthlyBalance * interestRate / 100;
      int mnthlyCarPayment = monthlyBalance + interest;

      System.out.println(mnthlyCarPayment);

    }

  }

  public static void main(String[] args) {

    CarLoan myCarloan = new CarLoan();
    myCarloan.checkLoanValidity();
  }

}