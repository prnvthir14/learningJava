public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int numSpeak, String regions, String sentenceStruct) {

    this.name = langName;
    this.numSpeakers = numSpeak;
    this.regionsSpoken = regions;
    this.wordOrder = sentenceStruct;

  }

  public static void main(String[] args) {

  }

}
