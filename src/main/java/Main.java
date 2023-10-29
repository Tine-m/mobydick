import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader();
        ArrayList<String> result = fileReader.loadFile();
        for (String textline: result) {
            System.out.println(textline);
        }

        System.out.println("----------- opsummering ----------------");
        System.out.println("ArrayListen indeholder nu "+ result.size()+ " tekstlinjer.");
        System.out.println("Første linje i filen: " + result.get(0));
        System.out.println("Sidste ordlinje i filen: " + result.get(result.size()-1));
    }
}
