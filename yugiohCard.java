public class yugiohCard extends Card {
  private int level;
  private String cardType;

  
 public yugiohCard(){
    super();
    this.cardType = "unknown";
    this.level = 0;
  }

    /*
    * Creates all constructors for Yu-Gi-Oh subclass
    */
  public yugiohCard(String name, double price, int listings, String cardType, int level) {
    super(name, price, listings);
    this.cardType = cardType;
    this.level = level;
  }

  public String getCardType() {
    return cardType;
  }

  public int getLevel() {
    return level;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public void setLevel(int level) {
    this.level = level;
  }

    /*
    * Creates the text output for the Yu-Gi-Oh card subclass with toString
    */
  public String toString() {
    String text = "Yu-Gi-Oh Card Name: " + cardName;
    text += " Price: " + this.getPrice() + ", Listings: " + this.listings;
    text += ", Card Type: " + cardType + ", Card Level: " + level;
    return text;
  }
  
}