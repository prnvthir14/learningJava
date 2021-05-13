class Mayan extends Language {
  // constructor
  Mayan(String languageName, int speakers) {
    // pass these to Lang constructor in Language.java
    // hard coded Central America and verb-object-subject are shared by all mayan
    // langs
    super(languageName, speakers, "Central America", "verb-object-subject");

  }

  // overide getInfo in parent class
  @Override
  public void getInfo() {

    System.out
        .println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");

  }

}