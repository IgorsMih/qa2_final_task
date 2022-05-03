package one_a_site.modules;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public void write(String name, String price, String url) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Java\\CreatedFiles\\one_a_lv_product.txt");
            myWriter.write(name);
            myWriter.write(price);
            myWriter.write(url);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
