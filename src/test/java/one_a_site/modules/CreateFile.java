package one_a_site.modules;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Java\\CreatedFiles\\one_a_lv_product.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
