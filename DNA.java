public class DNA {

  public static void main(String[] args) {

    String dna = args[0];

    // String dna1 = "ATGCGATACGCTTGA";
    // String dna2 = "ATGCGATACGTGA";
    // String dna3 = "ATTAATATGTACTGA";

    String startCodon = "ATG";
    String endCodon = "TGA";
    // index for end codon
    int endCodonStart = dna.length() - 3;
    // this is last letter
    int endCodonEnd = dna.length();

    System.out.println("dna" + dna);
    System.out.println("dna.substring(endCodonStart, endCodonEnd)" + dna.substring(endCodonStart, endCodonEnd));
    System.out.println("dna.substring(0, 3)" + dna.substring(0, 3));





    if (((dna.substring(0, 3)).equals(startCodon)) 
      && ((dna.substring(endCodonStart, endCodonEnd)).equals(endCodon))
      && (((dna.length()) % 3) == 0)) {

      // And find this protein in the dna by using the substring() string method.
      // Think about where you want the substring to begin and where you want the
      // substring to end.
      System.out.println("Contains a protein");
    } else {
      System.out.println("No protein");
    }

  }

}