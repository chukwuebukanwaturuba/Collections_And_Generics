package Entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class RFileReader {
    Store store;

    RFileReader(Store store){
        this.store = store;
    }

    public void readFile(){
        String file = "src/main/resources/chukwuebuka1 - Sheet1.csv";
        File filename = new File(file);
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(filename));
            String theLine = reader.readLine();
            String seperate = ",";

            while ((theLine = reader.readLine()) !=null){
                String[] product = theLine.split(seperate);

                Product p = new Product(product[0], product[1], Double.parseDouble(product[2]), Integer.parseInt(product[3]));
                store.getListOfProduct().add(p);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
