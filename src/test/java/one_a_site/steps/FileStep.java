package one_a_site.steps;

import io.cucumber.java.en.Then;
import one_a_site.modules.CreateFile;
import one_a_site.modules.WriteToFile;

public class FileStep {
    CreateFile createFile = new CreateFile();
    WriteToFile writeToFile = new WriteToFile();

    @Then("Create File for Product and Add Information toFile")
    public void createTheFileForProductInformation() {
//        createFile.create();
//        writeToFile.write();
    }
}
