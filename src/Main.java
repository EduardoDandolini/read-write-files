import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "/tmp/file.txt";
        String directory = "/tmp";

        Files.readFile(path);
        Files.writeFile(path);
        Files.findFiles(directory);

    }
}