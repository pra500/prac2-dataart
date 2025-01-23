package pac2;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderrrr {

    @DataProvider(name = "csvDataProvider")
    public Object[][] csvData() throws IOException {

       String filepath="C:\\Users\\pgupta\\IdeaProjects\\Yatra\\csvssss\\data.csv";
        //return CSVUtils.readCSV(filepath);

    }
}