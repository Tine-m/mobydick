import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public ArrayList<String> loadFile() throws FileNotFoundException {
        File moby = new File("MobyDick.txt");

        Scanner scan = new Scanner(moby);
        ArrayList<String> textLines = new ArrayList<>();

        while(scan.hasNext()){
            textLines.add(scan.nextLine());
        }

        return textLines;
    }
}
