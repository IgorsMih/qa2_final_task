package one_a_site.modules;

import one_a_site.models.Product;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static Product product = new Product();

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Java\\CreatedFiles\\one_a_lv_product.txt");
            myWriter.write(product.getProductName());
            myWriter.write(product.getProductPrice());
            myWriter.write(product.getProductLink());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
