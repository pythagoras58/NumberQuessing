import java.io.File;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws Exception{
        File file = new File("movie.txt");

        if(file.exists()){
            Scanner scanner = new Scanner(file);

            int counter = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                counter += line.split("").length;
            }
            System.out.println("[TOTAL COUNT::]==>" + counter);
        }else {
            System.out.println("SELECT THE RIGHT FILE");
        }
    }
}
