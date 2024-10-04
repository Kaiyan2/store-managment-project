public class Card {
  // Instance Variable
  public String cardName;
  private double price;
  public int listings; 

  
  // Constructors
  public Card() {
  this.cardName = "no name";
  this.price = 0;
  this.listings = 0;
  }

    /*
    * creates all constructors
    */
  public Card(String cardName, double price, int listings) {
    this.cardName = cardName;
    this.price = price;
    this.listings = listings;
  }
  
  // Accessor and Mutator Methods
  public String getName() {
    return cardName;
  }

  public double getPrice() {
    return price;
  }

  public int getListings() {
    return listings;
  }

  public void setName(String cardName) {
    this.cardName = cardName;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setListings(int listings) {
    this.listings = listings;
  }


  //toString()
public String toString() {
  String text = "Card Name: " + this.cardName + ", Price: " + this.price + ", Listings: " + this.listings;
  return text;
}
  // Other Method

}