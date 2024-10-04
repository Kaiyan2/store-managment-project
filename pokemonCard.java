public class pokemonCard extends Card {
  String type;

  public pokemonCard(){
    super();
    this.type = "unknown";
  }

    /*
    * Creates all constructors for pokemon subclass
    */
  public pokemonCard(String name, double price, int listings, String type) {
    super(name, price, listings);
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

    /*
    * Creates the text output for the pokemon card subclass with toString
    */
  public String toString() {
    String text = "Pokemon Card Name: " + cardName;
    text += " Price: " + this.getPrice() + ", Listings: " + this.listings;
    text += ", Pokemon Card Type: " + type;
    return text;
  }

}