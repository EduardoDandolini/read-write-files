import java.io.*;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.util.Scanner;

public class Files extends SimpleFileVisitor<Path> {

    public static void readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new FileReader(path));
        String line = "";
        while (true){
            if (line != null) {
                System.out.println(line);
            } else
                break;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }

    public static void writeFile(String path) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(path));
        String line = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Write...");
        line = sc.nextLine();
        bufferedWriter.append(line + "\n");
        bufferedWriter.close();
    }

    public static void findFiles(String path){
        File directory = new File(path);
        for (File file : directory.listFiles()) {
            System.out.println(file.getName());
            System.out.println("\n");
        }
    }

}
