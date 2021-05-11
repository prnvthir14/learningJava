public class Droid {

  int batteryLevel = 100;
  String name;

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

  }

}