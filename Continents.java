public class Continents {

  // practicing switch in Java
  int continent = 4;

  public void func() {

    switch (continent) {

      case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;

      case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;

      case 3:
        System.out.println("Europe: Moscow, Russia");
        break;

      case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;

      case 5:
        System.out.println("Asia: Shanghai, China");
        break;

      case 6:
        System.out.println("Australia: Sydney, Australia");
        break;

      case 7:
        System.out.println("Antarctica: McMurdo Station, US");
        break;

      default:
        System.out.println("Undefined Continent");
        break;

    }

  }

  public static void main(String[] args) {

    Continents newCont = new Continents();
    newCont.func();

  }

}