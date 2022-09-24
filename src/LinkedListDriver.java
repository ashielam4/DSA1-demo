import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedListDriver {
        public static void main(String[] args) throws FileNotFoundException {
                File file = new File("/Users/Ashiela/Downloads/input.txt");
                Scanner scan = new Scanner(file);
                while(scan.hasNextLine()) {
                        System.out.println(scan.nextLine());
                }

        }
}
