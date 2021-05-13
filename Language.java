public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // constructor
  Language(String langName, int numSpeak, String regions, String sentenceStruct) {

    this.name = langName;
    this.numSpeakers = numSpeak;
    this.regionsSpoken = regions;
    this.wordOrder = sentenceStruct;

  }

  public void getInfo(){

    System.out.println(this.name +  " is spoken by " + this.numSpeakers + " people mainly " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".");


  }

  public static void main(String[] args) {

    Language spanish = new Language("spanish",10000,"Everywehere they colonized","subject-verb-object");
    spanish.getInfo();

  }

}
