import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    /*
    * Prints the Pokemon Card Charizard's listings and info from TCG Player
    */
    pokemonCard Charizard = new pokemonCard("Charizard EX (Full Art),", 89.99, 56, "Fire");
    System.out.println(Charizard.toString());
    System.out.println("\n"); // prints blank line\

    /*
    * Prints the Yu-Gi-Oh Card Blue Eyes White Dragon's listings and info from TCG Player
    */
    yugiohCard bewDragon = new yugiohCard("Blue Eyes White Dragon (OG),", 63.37, 209, "Monster", 8);
    System.out.println(bewDragon.toString());
    System.out.println("\n"); // prints blank line





    
  }
}