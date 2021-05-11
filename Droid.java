public class Droid {

  int batteryLevel = 100;
  String name;

  public void performTask(String task) {

    System.out.println(name + " is performing task:" + task);
    batteryLevel -= 10;
  }

  public Droid(String droidName) {

    name = droidName;

  }

  public String toString() {
    String returnString = "Hi, i'm:" + name;

    return returnString;
  }

  public static void main(String[] args) {

    Droid codeyBot = new Droid("Codey");
    System.out.println(codeyBot);
    codeyBot.performTask("be a good boy");
    codeyBot.performTask("behave");
    codeyBot.performTask("be outside for the mail");
    codeyBot.performTask("be afraid of the man in the van");

  }

}