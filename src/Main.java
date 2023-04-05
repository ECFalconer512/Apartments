import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> dogFriendly = new ArrayList<>();
        ArrayList<String> type = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Double> pricePer = new ArrayList<>();
        ArrayList<Integer> bedrooms = new ArrayList<>();
        ArrayList<Double> bathrooms = new ArrayList<>();
        ArrayList<Integer> sqFT = new ArrayList<>();
        ArrayList<Double> distance = new ArrayList<>();

        int entryCount = 0;
        apartments apartments = new apartments();
        // reading info in file
        File file = new File("apartments.txt");
        try {
            Scanner sc = new Scanner(file);
            entryCount = 0;
            while (sc.hasNextLine()){
                String line = sc.next();
                // loop through the line, grabbing the category values
                String[] categories = line.split(" ");
                names.add(categories[0]);
                dogFriendly.add(categories[1]);
                type.add(categories[2]);
                price.add(Double.valueOf(categories[3]));
                bedrooms.add(valueOf(categories[4]));
                bathrooms.add(Double.valueOf(categories[5]));
                sqFT.add(valueOf(categories[6]));
                distance.add(Double.valueOf(categories[7]));
                entryCount++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for (int i = 1; i < entryCount; i++){
            apartments.add(new Node(names.get(i-1), dogFriendly.get(i-1), type.get(i-1), price.get(i-1),
                    bedrooms.get(i-1), bathrooms.get(i-1), sqFT.get(i-1), distance.get(i-1)));
        }

    }
}