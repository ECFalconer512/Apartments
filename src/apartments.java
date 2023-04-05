
import java.util.ArrayList;

public class apartments {

    ArrayList<Node> apartments = new ArrayList<>();
    // the current array list to be displayed
    ArrayList<Node> current = new ArrayList<>();

    public void add(Node toBeAdded){
        apartments.add(toBeAdded);
    }

    public void printToString(){
        System.out.print("Name                          DogFriendly Type      Price PricePer Bedrooms Bathrooms sqFT Distance");
        for(int i = 0; i < apartments.size(); i++){
            System.out.printf("%-30s %-12s %-10s %-4f %-6f %-9d %-9f %-5d %-3f",
                    apartments.get(i).name,
                    apartments.get(i).dogFriendly,
                    apartments.get(i).type,
                    apartments.get(i).price,
                    apartments.get(i).pricePer,
                    apartments.get(i).bedrooms,
                    apartments.get(i).bathrooms,
                    apartments.get(i).sqFT,
                    apartments.get(i).distanceFromU);
        }
    }


}
