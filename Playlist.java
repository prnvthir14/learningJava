import java.util.ArrayList;

public class Playlist {

  public static void main(String[] args) {
    // create new arrayList;
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("a");
    desertIslandPlaylist.add("b");
    desertIslandPlaylist.add("c");
    desertIslandPlaylist.add("d");
    desertIslandPlaylist.add("e");
    desertIslandPlaylist.add("f");
    desertIslandPlaylist.add("z");

    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.remove("e");
    desertIslandPlaylist.remove("a");
    desertIslandPlaylist.remove("b");
    System.out.println(desertIslandPlaylist);

    // swamp postions of items; swap 0 and 3

    // get indicies
    int indexOfSwap1 = desertIslandPlaylist.indexOf("c");
    int indexOfSwap2 = desertIslandPlaylist.indexOf("z");
    desertIslandPlaylist.set(indexOfSwap1, "z");
    desertIslandPlaylist.set(indexOfSwap2, "c");
    System.out.println(desertIslandPlaylist);

    String tempA = "a";
    desertIslandPlaylist.set(indexOfSwap2, tempA);
    System.out.println(desertIslandPlaylist);


  }

}