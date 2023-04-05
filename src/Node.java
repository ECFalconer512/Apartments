public class Node{
    public String name;
    public String dogFriendly;
    public String type;
    public double price;
    public double pricePer;
    public int bedrooms;
    public double bathrooms;
    public int sqFT;
    public double distanceFromU;
    public Node (String name, String dog, String type, double price, int bedrooms, double bathrooms, int sqFT, double distanceFromU){
        this.name = name;

        // setting state of dog friendly
        dogFriendly = dog;

        // setting the type of home
        this.type = type;

        // setting other characteristics
        this.price = price;
        pricePer = price/bedrooms;
        this.bathrooms = bathrooms;
        this.sqFT = sqFT;
        this.distanceFromU = distanceFromU;
    }

}
